package com.music.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.music.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByUsername(String username);
    boolean existsByUsername(String username);
}
