package com.example.MeetingRoomBookingSystem;

import com.example.MeetingRoomBookingSystem.Model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepo extends JpaRepository<Room, Long> {
}
