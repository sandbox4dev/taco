package com.shop.shirt.model.impl;

import com.shop.shirt.model.Shirt;
import lombok.Data;

import java.util.List;

@Data
public class ShirtImpl implements Shirt {

    private String id;
    private String name;
    private String shirtColor;
    private String shirtSize;
    private String shirtBrand;
    private String shirtMaterial;
    private List<ShirtType> shirtTypes;
    private List<ShirtDecoration> shirtDecorations;
}