package com.example.MeetingRoomBookingSystem;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
    @GetMapping("/index")
    String home(){
        return "index";
    }

    @GetMapping("/profile")
    String profile(){
        return "profile";
    }
}
