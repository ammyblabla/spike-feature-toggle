package com.example.featuretoggle.booking;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SmartBookingController {
    private final SmartBookingService bookingService;

    @GetMapping("/rooms/{type}")
    public List<Room> findSuitableRoom(@PathVariable RoomEnum.Type type) {
        return bookingService.findSuitableRoom(type);
    }
}
