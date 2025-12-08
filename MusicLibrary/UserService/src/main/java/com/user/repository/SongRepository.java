package com.user.repository;

import com.user.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SongRepository extends JpaRepository<Song, Long> {

    // Fetch ONLY visible songs
    List<Song> findByVisible(boolean visible);

    // Search by Song Name
    List<Song> findByNameContainingIgnoreCase(String name);

    // Search by Album
    List<Song> findByAlbumContainingIgnoreCase(String album);

    // Search by Singer
    List<Song> findBySingerContainingIgnoreCase(String singer);

    // Global search (optional)
    @Query("SELECT s FROM Song s WHERE " +
            "LOWER(s.name) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
            "LOWER(s.singer) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
            "LOWER(s.album) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
            "LOWER(s.musicDirector) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<Song> searchSongs(@Param("keyword") String keyword);
}
