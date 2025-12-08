package com.user.dto;

import lombok.Data;

@Data
public class SongDTO {
    private Long id;
    private String name;
    private String album;
    private String singer;
    private String musicDirector;
    private boolean visible;
}
