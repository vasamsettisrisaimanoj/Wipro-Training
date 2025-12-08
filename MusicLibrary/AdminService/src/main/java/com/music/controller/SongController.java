package com.music.controller;

import com.music.entity.Song;
import com.music.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/admin/songs")
public class SongController {	

    @Autowired
    private SongService service;

    // ADMIN — GET all songs
    @GetMapping
    public List<Song> getSongs() {
        return service.getAllSongs();
    }

    // ADMIN — ADD song
    @PostMapping
    public Song addSong(@RequestBody Song song) {
        return service.saveSong(song);
    }

    // ADMIN — UPDATE song
    @PutMapping("/{id}")
    public Song updateSong(@PathVariable Long id, @RequestBody Song updated) {
        return service.updateSong(id, updated);
    }

    // ADMIN — DELETE song
    @DeleteMapping("/{id}")
    public String deleteSong(@PathVariable Long id) {
        service.deleteSong(id);
        return "Song deleted successfully";
    }

    // USER — Get only visible songs
    @GetMapping("/public")
    public List<Song> getVisibleSongs() {
        return service.getVisibleSongs();
    }

    // USER — SEARCH songs (album + singer + music director)
    @GetMapping("/search")
    public List<Song> searchSongs(@RequestParam String keyword) {
        return service.searchSongs(keyword);
    }
    
 // USER — Get one song by ID (required for playlist)
    @GetMapping("/{id}")
    public Song getSong(@PathVariable Long id) {
        return service.getSongById(id);
    }
    
 // ADMIN — Update visibility
    @PatchMapping("/{id}/visibility")
    public String updateVisibility(@PathVariable Long id, @RequestParam boolean visible) {
        Song song = service.getSongById(id);
        song.setVisible(visible);
        service.saveSong(song);
        
        return "Song visibility updated";
    }


}
