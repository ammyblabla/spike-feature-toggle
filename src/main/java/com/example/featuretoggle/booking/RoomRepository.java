package com.example.featuretoggle.booking;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.example.featuretoggle.booking.RoomEnum.Status.AVAILABLE;
import static com.example.featuretoggle.booking.RoomEnum.Type.TWIN;


@Repository
public class RoomRepository {
    private List<Room> rooms = new ArrayList<>();

    public RoomRepository() {
        for (int i=0; i<10; i++) {
            rooms.add(Room.builder().id(i+1).status(AVAILABLE).type(RoomEnum.getRandomType()).build());
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

    public List<Room> findRoomByType(RoomEnum.Type type) {
        return rooms.stream()
                .filter(room -> type.equals(room.getType()))
                .collect(Collectors.toList());
    }
}
