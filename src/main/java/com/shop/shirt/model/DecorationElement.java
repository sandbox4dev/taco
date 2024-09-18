package com.shop.shirt.model;

import lombok.Data;

import java.util.Objects;

@Data
public class DecorationElement {

    private final String id;
    private final String name;
    private final Type type;

    public enum Type {
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
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DecorationElement that = (DecorationElement) o;

        if (!Objects.equals(id, that.id)) return false;
        if (!Objects.equals(name, that.name)) return false;
        return type == that.type;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}