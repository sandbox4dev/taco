package com.shop.shirt.model;

import java.util.List;

public interface ShopOrder {

    String getId();

    void setId(String id);

    String getClientName();

    void setClientName(String clientName);

    String getClientAddress();

    void setClientAddress(String clientAddress);

    String getClientPhoneNumber();

    void setClientPhoneNumber(String clientPhoneNumber);

    String getClientEmail();

    void setClientEmail(String clientEmail);

    List<Shirt> getOrderItems();

    void setOrderItems(List<Shirt> orderItems);

    String getOrderStatus();

    void setOrderStatus(String orderStatus);

    void addOrderItem(Shirt orderItem);

    void removeOrderItem(Shirt orderItem);
}