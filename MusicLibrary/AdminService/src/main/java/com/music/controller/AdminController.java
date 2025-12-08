package com.music.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.music.entity.Admin;
import com.music.repository.AdminRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/admins")
public class AdminController {

    private final AdminRepository repo;

    public AdminController(AdminRepository repo) {
        this.repo = repo;
    }

    // Register admin
    @PostMapping
    public ResponseEntity<?> register(@RequestBody Admin admin) {
        if (repo.existsByUsername(admin.getUsername())) {
            throw new RuntimeException("Username already exists");
        }
        repo.save(admin);
        return ResponseEntity.ok("Admin registered");
    }

    // Login admin
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Admin login) {
        Admin a = repo.findByUsername(login.getUsername());

        if (a == null || !a.getPassword().equals(login.getPassword())) {
            throw new RuntimeException("Invalid credentials");
        }
        return ResponseEntity.ok("Login success");
    }

    // Get all admins
    @GetMapping
    public List<Admin> all() {
        return repo.findAll();
    }

    // Get by id
    @GetMapping("/{id}")
    public Admin get(@PathVariable Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Admin not found"));
    }

    // Update admin
    @PutMapping("/{id}")
    public Admin update(@PathVariable Long id, @RequestBody Admin updated) {
        return repo.findById(id).map(a -> {
            a.setUsername(updated.getUsername());
            a.setEmail(updated.getEmail());
            a.setPassword(updated.getPassword());
            return repo.save(a);
        }).orElseThrow(() -> new RuntimeException("Admin not found"));
    }

    // Delete admin
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        Admin admin = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Admin not found"));

        repo.delete(admin);
        return ResponseEntity.ok("Admin deleted");
    }
}
