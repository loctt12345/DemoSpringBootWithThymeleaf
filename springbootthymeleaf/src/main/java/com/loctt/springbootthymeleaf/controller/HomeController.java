/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loctt.springbootthymeleaf.controller;

import com.loctt.springbootthymeleaf.model.User;
import com.loctt.springbootthymeleaf.model.UserTest;
import com.loctt.springbootthymeleaf.repository.UserRepository;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author loc12345
 */
@Controller
public class HomeController {
    @Autowired
    private UserRepository userRepository;
    
    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("arg", "cd");
        List<String> list = Arrays.asList("dasd", "bcsd", "dsadas");
        model.addAttribute("list", list);
        model.addAttribute("user", new UserTest("loc", 21));
        
        List<UserTest> listUser = Arrays.asList(new UserTest("loc1", 10),
                new UserTest("loc2", 15),
                new UserTest("loc3", 23)
        );
        model.addAttribute("userList", listUser);
        
//        for (User x : this.userRepository.findAll()) {
//            System.out.println(x.getFullName());
//        }
        
        return "index";
    }
    
    @RequestMapping("/adddasdsad")
    public String add() {
        User user = new User("loc", "loc1", "123", "ADMIN", true);
        this.userRepository.save(user);
        return "redirect:/home";
    }
}
