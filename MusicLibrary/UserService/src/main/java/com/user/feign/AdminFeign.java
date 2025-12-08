package com.user.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.user.dto.SongDTO;

@FeignClient(name = "ADMIN-SERVICE")
public interface AdminFeign {

    // USER — Get only visible songs
    @GetMapping("/api/admin/songs/public")
    List<SongDTO> getVisibleSongs();

    //API path for getting a song by ID
    @GetMapping("/api/admin/songs/{id}")
    SongDTO getSong(@PathVariable("id") Long id);
}
