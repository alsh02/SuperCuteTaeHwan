package com.jmt.SuperCuteTaeHwan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuestionController {

    @GetMapping("/cat/Q2")
    public String question2Cat() {
        return "question2";
    }

    @GetMapping("/dog/Q2")
    public String question2Dog() {
        return "question2";
    }
}
