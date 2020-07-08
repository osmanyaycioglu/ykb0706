package com.training.ykb.order.models;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Order {

    @NotNull(message = "orderId null olamaz.")
    private Long         orderId;
    @NotNull(message = "customerId null olamaz.")
    private Long         customerId;
    @Size(min = 1, message = "En az bir tane menu den yemek seçmelisiniz.")
    private List<String> orderItems;

    public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(final Long customerIdParam) {
        this.customerId = customerIdParam;
    }

    public List<String> getOrderItems() {
        return this.orderItems;
    }

    public void setOrderItems(final List<String> orderItemsParam) {
        this.orderItems = orderItemsParam;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    public void setOrderId(final Long orderIdParam) {
        this.orderId = orderIdParam;
    }

}
