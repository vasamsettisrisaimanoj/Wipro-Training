package com.user.controller;

import com.user.entity.Playlist;
import com.user.dto.SongDTO;
import com.user.service.PlaylistService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/playlists")
@CrossOrigin(origins = "*")
public class PlaylistController {

    @Autowired
    private PlaylistService service;

    // CREATE PLAYLIST
    @PostMapping("/{userId}")
    public Playlist createPlaylist(@PathVariable Long userId, @RequestParam String name) {
        return service.createPlaylist(userId, name);
    }

    // GET USER PLAYLISTS
    @GetMapping("/user/{userId}")
    public List<Playlist> getUserPlaylists(@PathVariable Long userId) {
        return service.getUserPlaylists(userId);
    }

    // DELETE PLAYLIST
    @DeleteMapping("/{playlistId}")
    public ResponseEntity<String> deletePlaylist(@PathVariable Long playlistId) {
        service.deletePlaylist(playlistId);
        return ResponseEntity.ok("Playlist deleted");
    }

    // RENAME PLAYLIST
    @PutMapping("/{playlistId}")
    public ResponseEntity<String> renamePlaylist(
            @PathVariable Long playlistId,
            @RequestParam String newName) {

        service.renamePlaylist(playlistId, newName);
        return ResponseEntity.ok("Playlist renamed");
    }

    // ADD SONG TO PLAYLIST
    @PostMapping("/{playlistId}/songs/{songId}")
    public ResponseEntity<String> addSong(@PathVariable Long playlistId, @PathVariable Long songId) {
        service.addSong(playlistId, songId);
        return ResponseEntity.ok("Song added to playlist");
    }

    // REMOVE SPECIFIC SONG
    @DeleteMapping("/{playlistId}/songs/{songId}")
    public ResponseEntity<String> removeSong(@PathVariable Long playlistId, @PathVariable Long songId) {
        service.removeSong(playlistId, songId);
        return ResponseEntity.ok("Song removed from playlist");
    }

    //CLEAR ALL SONGS (USED WHEN SAVING FROM UI)
    @DeleteMapping("/{playlistId}/songs")
    public ResponseEntity<String> clearPlaylistSongs(@PathVariable Long playlistId) {
        System.out.println("CLEARING PLAYLIST SONGS for playlistId = " + playlistId);
        service.clearPlaylistSongs(playlistId);
        return ResponseEntity.ok("Playlist songs cleared");
    }



    // GET SONGS IN PLAYLIST
    @GetMapping("/{playlistId}/songs")
    public List<SongDTO> getSongs(@PathVariable Long playlistId) {
        return service.getPlaylistSongs(playlistId);
    }
}
