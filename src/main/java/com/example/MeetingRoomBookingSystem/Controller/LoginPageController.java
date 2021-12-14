package com.example.MeetingRoomBookingSystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginPageController {
    @GetMapping("/")
    String signIn(){
        return "login";
    }

    @GetMapping("/signup")
    String signUp(){
        return "signup";
    }
}
