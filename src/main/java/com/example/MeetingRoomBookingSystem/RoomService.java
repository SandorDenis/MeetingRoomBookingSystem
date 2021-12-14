package com.example.MeetingRoomBookingSystem;

import com.example.MeetingRoomBookingSystem.Model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    private final RoomRepo roomRepo;

    @Autowired
    public RoomService(RoomRepo roomRepo) {
        this.roomRepo = roomRepo;
    }

    public List<Room> getRooms() {
        return roomRepo.findAll();
    }

    public Room addRoom(Room room){
        return roomRepo.save(room);
    }
}
