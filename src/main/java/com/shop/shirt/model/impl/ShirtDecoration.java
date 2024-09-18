package com.shop.shirt.model.impl;

import lombok.Data;

@Data
public class ShirtDecoration {

    private final String id;
    private final String name;
    private final DecorationType decorationType;

    public enum DecorationType {
        NONE,
        IMAGE,
        PATCH,
        TAG,
        TEXT,
        BRAND
    }

    @Override
    public String toString() {
        return "DecorationElement{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type=" + decorationType +
                '}';
    }
}