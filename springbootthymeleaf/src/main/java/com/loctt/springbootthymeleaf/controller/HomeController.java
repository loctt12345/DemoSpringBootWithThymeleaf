/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loctt.springbootthymeleaf.controller;

import com.loctt.springbootthymeleaf.model.User;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author loc12345
 */
@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("arg", "cd");
        List<String> list = Arrays.asList("dasd", "bcsd", "dsadas");
        model.addAttribute("list", list);
        model.addAttribute("user", new User("loc", 21));
        
        List<User> listUser = Arrays.asList(
                new User("loc1", 10),
                new User("loc2", 15),
                new User("loc3", 23)
        );
        model.addAttribute("userList", listUser);
        return "index";
    }
}
