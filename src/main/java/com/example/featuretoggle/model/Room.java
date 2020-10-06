package com.example.featuretoggle.model;

import com.example.featuretoggle.model.RoomEnum;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Room {
    private Integer id;
    private RoomEnum.Status status;
    private RoomEnum.Type type;
}
