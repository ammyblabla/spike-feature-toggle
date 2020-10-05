package com.example.featuretoggle.booking;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookingController {
    private final BookingService bookingService;

    @RequestMapping("/")
    public String index() {
        return "Welcome to booking service";
    }

    @RequestMapping("/book/{roomId}")
    public Room bookRoom(@PathVariable Integer roomId) {
        return bookingService.bookRoom(roomId);
    }

    @RequestMapping("/cancel/{roomId}")
    public Room cancelBook(@PathVariable Integer roomId) {
        return bookingService.cancelBook(roomId);
    }

    @RequestMapping("/rooms")
    public List<Room> getRooms() {
        return bookingService.getRooms();
    }
}
