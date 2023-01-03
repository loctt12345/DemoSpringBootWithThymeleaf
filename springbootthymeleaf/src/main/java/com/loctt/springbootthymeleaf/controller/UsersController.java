/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loctt.springbootthymeleaf.controller;

import com.loctt.springbootthymeleaf.model.User;
import com.loctt.springbootthymeleaf.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author loc12345
 */
@RestController
public class UsersController {
    @Autowired
    private UserRepository userRepository;
    
    @GetMapping("/api/v")
    public ResponseEntity<List<User>> showAll() {
        return ResponseEntity.ok().body(this.userRepository.findAll());
    }
    
    @PutMapping("/api/v")
    public ResponseEntity<User> add(@RequestBody User user) {
        this.userRepository.save(user);
        return ResponseEntity.ok().body(user);
    }
    
    @DeleteMapping("/api/v") 
    public ResponseEntity<User> delete(@RequestBody User user) {
        this.userRepository.delete(user);
        return ResponseEntity.ok().body(user);
    }
    
}
