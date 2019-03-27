package com.gdou.survey.demo.controller;

import com.gdou.survey.demo.entity.User;
import com.gdou.survey.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping(path = "/demo")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/user/{id}")
    public User getUser(@PathVariable("id")Integer id ){
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent()){
            return user.get();
        }
        return null;
    }
    @RequestMapping(value = "/save")
    public User addNewUser(@RequestBody User user){
        user.setCreatTime(new Date());
        userRepository.save(user);
        return user;
    }
}
