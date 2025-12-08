package com.music.controller;

import com.music.entity.UserDTO;
import com.music.feign.UserFeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/users")
@CrossOrigin("*")
public class AdminUserController {

    private final UserFeignClient userClient;

    public AdminUserController(UserFeignClient userClient) {
        this.userClient = userClient;
    }

    @GetMapping
    public List<UserDTO> getUsers() {
        return userClient.getAllUsers();
    }
}
