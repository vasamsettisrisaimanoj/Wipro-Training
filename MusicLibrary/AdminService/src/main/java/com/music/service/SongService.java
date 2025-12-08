package com.music.service;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.music.entity.Song;
import com.music.repository.SongRepository;

@Service
public class SongService {

    @Autowired
    private SongRepository repo;

    // GET ALL SONGS (Admin)
    public List<Song> getAllSongs() {
        return repo.findAll();
    }

    // ADD NEW SONG
    public Song saveSong(Song song) {
        return repo.save(song);
    }

    // UPDATE SONG
    public Song updateSong(Long id, Song updatedSong) {
        Song old = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Song not found"));

        old.setName(updatedSong.getName());
        old.setAlbum(updatedSong.getAlbum());
        old.setSinger(updatedSong.getSinger());
        old.setMusicDirector(updatedSong.getMusicDirector());
        old.setVisible(updatedSong.isVisible());

        return repo.save(old);
    }

    // DELETE SONG
    public void deleteSong(Long id) {
        Song s = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Song not found"));
        repo.delete(s);
    }

    // GET VISIBLE SONGS (User)
    public List<Song> getVisibleSongs() {
        return repo.findByVisibleTrue();
    }

    // SEARCH SONGS (Album + Singer + Music Director)
    public List<Song> searchSongs(String keyword) {

        List<Song> albumMatches = repo.findByAlbumContainingIgnoreCase(keyword);
        List<Song> singerMatches = repo.findBySingerContainingIgnoreCase(keyword);
        List<Song> directorMatches = repo.findByMusicDirectorContainingIgnoreCase(keyword);

        // Avoid duplicates using Set
        Set<Song> combined = new LinkedHashSet<>();
        combined.addAll(albumMatches);
        combined.addAll(singerMatches);
        combined.addAll(directorMatches);

        return new ArrayList<>(combined);
        
    }
    
    public Song getSongById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Song not found"));
    }

}
