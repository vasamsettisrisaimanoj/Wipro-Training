package com.music.service;


import com.music.entity.Admin; 
import com.music.repository.AdminRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminService {

    private final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    // CREATE ADMIN
    public ResponseEntity<Admin> createAdmin(Admin admin) {
        Admin savedAdmin = adminRepository.save(admin);
        return new ResponseEntity<>(savedAdmin, HttpStatus.CREATED);
    }

    // GET ADMIN BY ID
    public ResponseEntity<?> getAdminById(Long id) {
        Optional<Admin> admin = adminRepository.findById(id);

        if (admin.isPresent()) {
            return ResponseEntity.ok(admin.get());
        } else {
            return new ResponseEntity<>("Admin not found", HttpStatus.NOT_FOUND);
        }
    }

    // UPDATE ADMIN
    public ResponseEntity<?> updateAdmin(Long id, Admin updatedAdmin) {
        Optional<Admin> oldAdmin = adminRepository.findById(id);

        if (oldAdmin.isPresent()) {
            Admin a = oldAdmin.get();
            a.setEmail(updatedAdmin.getEmail());
            a.setPassword(updatedAdmin.getPassword());

            adminRepository.save(a);
            return ResponseEntity.ok(a);
        } else {
            return new ResponseEntity<>("Admin not found", HttpStatus.NOT_FOUND);
        }
    }

    // DELETE ADMIN
    public ResponseEntity<?> deleteAdmin(Long id) {
        if (adminRepository.existsById(id)) {
            adminRepository.deleteById(id);
            return ResponseEntity.ok("Admin deleted successfully");
        } else {
            return new ResponseEntity<>("Admin not found", HttpStatus.NOT_FOUND);
        }
    }
    
}