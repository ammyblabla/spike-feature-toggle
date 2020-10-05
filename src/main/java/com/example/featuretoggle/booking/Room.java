package com.example.featuretoggle.booking;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Room {
    private Integer id;
    private RoomEnum.Status status;
    private RoomEnum.Type type;
}
