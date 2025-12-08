package com.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.Song;
import com.user.repository.SongRepository;

@Service
public class SongService {

    @Autowired
    private SongRepository repo;

    // Fetch all visible songs
    public List<Song> getVisibleSongs() {
        return repo.findByVisible(true);
    }

    // Search by Song Name
    public List<Song> searchByName(String name) {
        return repo.findByNameContainingIgnoreCase(name);
    }

    // Search by Album
    public List<Song> searchByAlbum(String album) {
        return repo.findByAlbumContainingIgnoreCase(album);
    }

    // Search by Singer
    public List<Song> searchBySinger(String singer) {
        return repo.findBySingerContainingIgnoreCase(singer);
    }
}
