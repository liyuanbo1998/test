package com.example.test.controller;

import com.example.test.bean.User;
import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/users")
    public String get_All(Model model){
        List<User> users =userService.getAll();
        model.addAttribute("users",users);
        return "userlist";
    }
}
