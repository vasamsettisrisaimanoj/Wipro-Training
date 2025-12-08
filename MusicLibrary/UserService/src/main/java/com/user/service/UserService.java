package com.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.User;
import com.user.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    // REGISTER
    public User register(User user) {
        return repo.save(user);
    }

    // LOGIN
    public User login(String username, String password) {
        User user = repo.findByUsername(username);

        if (user == null || !user.getPassword().equals(password)) {
            throw new RuntimeException("Invalid username or password");
        }
        return user;
    }

    // GET ALL USERS
    public List<User> getAllUsers() {
        return repo.findAll();
    }

    // GET USER BY ID
    public User getUserById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    // UPDATE USER
    public User updateUser(Long id, User updatedUser) {
        User existing = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        existing.setUsername(updatedUser.getUsername());
        existing.setEmail(updatedUser.getEmail());
        existing.setPhone(updatedUser.getPhone());
        existing.setPassword(updatedUser.getPassword());
        existing.setRole(updatedUser.getRole());

        return repo.save(existing);
    }

    // DELETE USER
    public void deleteUser(Long id) {
        User existing = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        repo.delete(existing);
    }
}
