/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loctt.springbootthymeleaf.repository;

import com.loctt.springbootthymeleaf.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author loc12345
 */
public interface UserRepository extends JpaRepository<User, String>{
    
}
