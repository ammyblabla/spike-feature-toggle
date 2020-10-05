package com.example.featuretoggle.booking;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import static com.example.featuretoggle.booking.RoomStatus.Status.AVAILABLE;

@Repository
public class RoomRepository {
    private List<Room> rooms = new ArrayList<>();

    public RoomRepository() {
        for (int i=0; i<10; i++) {
            rooms.add(Room.builder().id(i+1).status(AVAILABLE).build());
        }
    }

    public Room getRoom(Integer id) {
        return rooms.get(id-1);
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public Room updateRoom(Room room) {
        Integer id = room.getId();
        rooms.set(id-1, room);
        return getRoom(id);
    }
}
