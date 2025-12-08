package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.user.dto.SongDTO;
import com.user.entity.User;
import com.user.feign.AdminFeign;
import com.user.service.UserService;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService service;

    // REGISTER
    @PostMapping
    public ResponseEntity<String> register(@RequestBody User user) {
        service.register(user);
        return ResponseEntity.ok("User registered");
    }

    // GET ALL USERS
    @GetMapping("/all")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    // GET USER BY ID
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return service.getUserById(id);
    }

    // UPDATE USER
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return service.updateUser(id, user);
    }

    // DELETE USER
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        service.deleteUser(id);
        return ResponseEntity.ok("User deleted successfully");
    }

    // LOGIN
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User loginReq) {
        service.login(loginReq.getUsername(), loginReq.getPassword());
        return ResponseEntity.ok("Login success");
    }

    @Autowired
    private AdminFeign songClient;

    // USER — View only visible songs
    @GetMapping("/songs")
    public List<SongDTO> getAllSongsForUser() {
        return songClient.getVisibleSongs();
    }
}
	