package com.example.featuretoggle.service;

import com.example.featuretoggle.model.Room;
import com.example.featuretoggle.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.featuretoggle.model.RoomEnum.Status.AVAILABLE;
import static com.example.featuretoggle.model.RoomEnum.Status.BOOKED;

@Service
@RequiredArgsConstructor
public class BookingService {
    private final RoomRepository roomRepository;

    public Room bookRoom(Integer roomId) {
        Room room = roomRepository.getRoom(roomId);
        room.setStatus(BOOKED);
        return roomRepository.updateRoom(room);
    }

    public Room cancelBook(Integer roomId) {
        Room room = roomRepository.getRoom(roomId);
        room.setStatus(AVAILABLE);
        return roomRepository.updateRoom(room);
    }

    public List<Room> getRooms() {
        return roomRepository.getRooms();
    }
}
