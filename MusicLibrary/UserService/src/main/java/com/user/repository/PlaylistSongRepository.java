package com.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.user.entity.PlaylistSong;

@Repository
public interface PlaylistSongRepository extends JpaRepository<PlaylistSong, Long> {

    List<PlaylistSong> findByPlaylistId(Long playlistId);

    @Modifying
    @Transactional
    @Query("DELETE FROM PlaylistSong ps WHERE ps.playlistId = :playlistId")
    void deleteByPlaylistId(@Param("playlistId") Long playlistId);

    List<PlaylistSong> findByPlaylistIdAndSongId(Long playlistId, Long songId);

    @Modifying
    @Transactional
    void deleteByPlaylistIdAndSongId(Long playlistId, Long songId);
}











//public interface PlaylistSongRepository extends JpaRepository<PlaylistSong, Long> {
//
//    List<PlaylistSong> findByPlaylistId(Long playlistId);
//
//    void deleteByPlaylistId(Long playlistId);
//
//
//    void deleteByPlaylistIdAndSongId(Long playlistId, Long songId);
//
//    List<PlaylistSong> findByPlaylistIdAndSongId(Long playlistId, Long songId);
//    
//    
//}
