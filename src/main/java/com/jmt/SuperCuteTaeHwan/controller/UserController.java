package com.jmt.SuperCuteTaeHwan.controller;

import com.jmt.SuperCuteTaeHwan.UserForm;
import com.jmt.SuperCuteTaeHwan.domain.User;
import com.jmt.SuperCuteTaeHwan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/* 유저 정보 입력 컨트롤러 */
@Controller
public class UserController {

    private final UserService userService;

    /* UserService 를 의존성 주입으로 넣어줌 */
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/Q1")
    public String UserPostStart(UserForm userForm) {
        User u = new User();
        u.setName(userForm.getName());
        u.setAge(userForm.getAge());
        u.setGender(userForm.getGender());
        u.setBelong(userForm.getBelong());

        userService.join(u);
        return "question1";
    }
}
