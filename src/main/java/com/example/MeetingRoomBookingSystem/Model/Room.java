package com.example.MeetingRoomBookingSystem.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Getter
@Setter
public class Room {

    @Id
    @GeneratedValue
    private Long id;
    private String roomName;
    private String description;
    private String image;

    public Room() {
    }

    public Room(String roomName, String description, String image) {
        this.roomName = roomName;
        this.description = description;
        this.image = image;
    }
}
