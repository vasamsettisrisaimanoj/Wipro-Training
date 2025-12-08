package com.music.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    
    private String album;
    
    private String musicDirector;
    
    private String singer;
    
    
    
    
    
    private boolean visible;
    
}
