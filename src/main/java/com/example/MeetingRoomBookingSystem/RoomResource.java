package com.example.MeetingRoomBookingSystem;

import com.example.MeetingRoomBookingSystem.Model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Random;

@Controller
public class RoomResource {
    @Autowired
    private RoomService roomService;

    @GetMapping("/index")
    public String getRooms(Model model){
        model.addAttribute("rooms", roomService.getRooms());
        return "index";
    }

    @PostMapping("/add")
    public String addRoom(@ModelAttribute(value="room") Room newRoom){
        Long id = new Random().nextLong();
        newRoom.setId(Math.abs(id));
        roomService.addRoom(newRoom);
        return "redirect:/index";
    }
}
