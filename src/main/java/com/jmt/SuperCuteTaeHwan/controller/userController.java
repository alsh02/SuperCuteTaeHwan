package com.jmt.SuperCuteTaeHwan.controller;

import com.jmt.SuperCuteTaeHwan.UserForm;
import com.jmt.SuperCuteTaeHwan.domain.User;
import com.jmt.SuperCuteTaeHwan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class userController {

    private final UserService userService;

    @Autowired
    public userController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/test")
    public String UserTest() { return "userTest"; }

    @PostMapping("/users/test")
    public String UserStart(UserForm userForm) {
        User u = new User();
        u.setName(userForm.getName());
        u.setAge(userForm.getAge());
        u.setGender(userForm.getGender());
        u.setBelong(userForm.getBelong());

        userService.join(u);
        return "question1";
    }
}
