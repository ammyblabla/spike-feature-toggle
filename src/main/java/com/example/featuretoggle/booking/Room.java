package com.example.featuretoggle.booking;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Room {
    private Integer id;
    private RoomStatus.Status status;
}
