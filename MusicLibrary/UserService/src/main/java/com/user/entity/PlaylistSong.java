package com.user.entity;

import jakarta.persistence.*;

@Entity
@Table(
    name = "playlist_song",
    uniqueConstraints = @UniqueConstraint(columnNames = {"playlist_id", "song_id"})
)
public class PlaylistSong {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="playlist_id")
    private Long playlistId;

    @Column(name="song_id")
    private Long songId;

    public Long getId() { 
    	return id; 
    	}
    public void setId(Long id) {
    	this.id = id; 
    	}

    public Long getPlaylistId() {
    	return playlistId; 
    	}
    public void setPlaylistId(Long playlistId) { 
    	this.playlistId = playlistId; 
    	}

    public Long getSongId() {
    	return songId; 
    	}
    public void setSongId(Long songId) { 
    	this.songId = songId; 
    	}
}
