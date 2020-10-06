package com.example.featuretoggle.model;

import java.util.Random;

public class RoomEnum {
    public enum Status {
        AVAILABLE,
        BOOKED
    }

    public enum Type {
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
