package com.music.feign;

import com.music.entity.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "user-service", url = "http://localhost:8083")
public interface UserFeignClient {

    @GetMapping("/api/users/all")
    List<UserDTO> getAllUsers();
}
