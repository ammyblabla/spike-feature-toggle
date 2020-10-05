package com.example.featuretoggle.booking;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmartBookingService extends BookingService{
    private final RoomRepository roomRepository;

    public SmartBookingService(RoomRepository roomRepository) {
        super(roomRepository);
        this.roomRepository = roomRepository;
    }

    public List<Room> findSuitableRoom(RoomEnum.Type type) {
        return roomRepository.findRoomByType(type);
    }
}
