package com.example.MeetingRoomBookingSystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

    @GetMapping("/profile")
    String profile(){
        return "profile";
    }
}
