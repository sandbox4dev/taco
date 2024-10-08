package com.shop.shirt.model;

import com.shop.shirt.model.impl.ShirtDecoration;
import com.shop.shirt.model.impl.ShirtType;

import java.util.List;

public interface Shirt {

    String getId();
    void setId(String id);
    String getName();
    void setName(String name);
    List<ShirtType> getShirtTypes();
    void setShirtTypes(List<ShirtType> shirtTypes);
    String getShirtColor();
    void setShirtColor(String shirtColor);
    String getShirtSize();
    void setShirtSize(String shirtSize);
    String getShirtBrand();
    void setShirtBrand(String shirtBrand);
    String getShirtMaterial();
    void setShirtMaterial(String shirtMaterial);
    List<ShirtDecoration> getShirtDecorations();
    void setShirtDecorations(List<ShirtDecoration> shirtDecoration);
}