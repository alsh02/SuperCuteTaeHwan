package com.jmt.SuperCuteTaeHwan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuestionController {

    @GetMapping("/cat/Q2")
    public String question1Cat() {
        return "question2";
    }

    @GetMapping("/dog/Q2")
    public String question1Dog() {
        return "question2";
    }

    @GetMapping("/dynamic/Q3")
    public String question2Dynamic() {
        return "question3";
    }

    @GetMapping("/static/Q3")
    public String question2Static() {
        return "question3";
    }

    @GetMapping("/sunny/Q4")
    public String question3Sunny() {
        return "question4";
    }

    @GetMapping("/cloudy/Q4")
    public String question3Cloudy() {
        return "question4";
    }

    @GetMapping("/newyork/process")
    public String question4NewYork() {
        return "result";
    }

    @GetMapping("/bali/process")
    public String question4Bali() {
        return "result";
    }
}
