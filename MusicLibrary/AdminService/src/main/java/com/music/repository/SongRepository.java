package com.music.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.music.entity.Song;

public interface SongRepository extends JpaRepository<Song, Long> {

    // USER — Only visible songs
    List<Song> findByVisibleTrue();

    // Search by album
    List<Song> findByAlbumContainingIgnoreCase(String album);

    // Search by singer/artist
    List<Song> findBySingerContainingIgnoreCase(String singer);

    // Search by music director
    List<Song> findByMusicDirectorContainingIgnoreCase(String director);
}
