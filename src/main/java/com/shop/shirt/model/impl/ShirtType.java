package com.shop.shirt.model.impl;

import lombok.Data;

@Data
public class ShirtType {

    private final String id;
    private final String name;
    private final Type shirtType;

    public enum Type {
        TSHIRT,
        HOODIE,
        SWEATSHIRT,
        JACKET,
        JUMPER,
        PULLOVER,
        CARDIGAN
    }
}
