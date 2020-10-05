package com.example.featuretoggle.booking;

import java.util.Random;

public class RoomEnum {
    enum Status {
        AVAILABLE,
        BOOKED
    }

    enum Type {
        TWIN,
        QUEEN,
        KING,
        STUDIO,
        SUITE
    }

    public static Type getRandomType() {
        Type[] types = Type.values();
        return types[new Random().nextInt(types.length)];

    }

}
