package com.shop.shirt.model.impl;

import com.shop.shirt.model.Shirt;
import com.shop.shirt.model.ShopOrder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ShopOrderImpl implements ShopOrder {

    private String id;
    private String clientName;
    private String clientAddress;
    private String clientPhoneNumber;
    private String clientEmail;
    private String orderStatus;
    private List<Shirt> orderItems = new ArrayList<>();

    @Override
    public void addOrderItem(Shirt orderItem) {
        this.orderItems.add(orderItem);
    }

    @Override
    public void removeOrderItem(Shirt orderItem) {
        this.orderItems.remove(orderItem);
    }
}