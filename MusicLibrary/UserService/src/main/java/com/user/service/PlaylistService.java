package com.user.service;

import com.user.entity.Playlist;
import com.user.entity.PlaylistSong;
import com.user.repository.PlaylistRepository;
import com.user.repository.PlaylistSongRepository;
import com.user.feign.AdminFeign;
import com.user.dto.SongDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PlaylistService {

    @Autowired
    private PlaylistRepository playlistRepo;

    @Autowired
    private PlaylistSongRepository playlistSongRepo;

    @Autowired
    private AdminFeign songClient;

    // CREATE PLAYLIST
    public Playlist createPlaylist(Long userId, String name) {
        Playlist p = new Playlist();
        p.setName(name);
        p.setUserId(userId);
        return playlistRepo.save(p);
    }

    public List<Playlist> getUserPlaylists(Long userId) {
        return playlistRepo.findByUserId(userId);
    }

    // DELETE PLAYLIST
    public void deletePlaylist(Long playlistId) {

        System.out.println("Deleting playlist ID = " + playlistId);

        List<PlaylistSong> before = playlistSongRepo.findByPlaylistId(playlistId);
        System.out.println("Songs before delete = " + before.size());

        playlistSongRepo.deleteByPlaylistId(playlistId);

        List<PlaylistSong> after = playlistSongRepo.findByPlaylistId(playlistId);
        System.out.println("Songs after delete = " + after.size());

        playlistRepo.deleteById(playlistId);
        System.out.println("Playlist row deleted.");
    }


    // ADD SONG
    public void addSong(Long playlistId, Long songId) {
        PlaylistSong ps = new PlaylistSong();
        ps.setPlaylistId(playlistId);
        ps.setSongId(songId);
        playlistSongRepo.save(ps);
    }

    // UPDATED REMOVE SONG — handles duplicates
    public void removeSong(Long playlistId, Long songId) {

        // Fetch the entry(s) matching playlistId + songId
        List<PlaylistSong> list = playlistSongRepo.findByPlaylistIdAndSongId(playlistId, songId);

        // If nothing exists, simply return (avoid errors)
        if (list == null || list.isEmpty()) {
            System.out.println("No matching song found to remove.");
            return;
        }

        // Remove the specific song mapping
        playlistSongRepo.deleteAll(list);

        System.out.println("Removed songId " + songId + " from playlistId " + playlistId);
    }




    // CLEAR ALL SONGS
    public void clearPlaylistSongs(Long playlistId) {
        System.out.println("SERVICE: CLEAR songs for " + playlistId);
        playlistSongRepo.deleteByPlaylistId(playlistId);
        System.out.println("SERVICE: After delete, count = " 
            + playlistSongRepo.findByPlaylistId(playlistId).size());
    }


    // GET SONGS
    public List<SongDTO> getPlaylistSongs(Long playlistId) {

        List<PlaylistSong> entries = playlistSongRepo.findByPlaylistId(playlistId);
        List<SongDTO> songs = new ArrayList<>();

        for (PlaylistSong entry : entries) {
            try {
                SongDTO s = songClient.getSong(entry.getSongId());

                if (s != null) {
                    songs.add(s);
                }
            } catch (Exception ex) {
                System.out.println("Song not found in ADMIN-SERVICE: " + entry.getSongId());
            }
        }

        return songs;
    }


    // RENAME PLAYLIST
    public void renamePlaylist(Long playlistId, String newName) {
        Playlist playlist = playlistRepo.findById(playlistId)
                .orElseThrow(() -> new RuntimeException("Playlist not found"));

        playlist.setName(newName);
        playlistRepo.save(playlist);
    }
}
