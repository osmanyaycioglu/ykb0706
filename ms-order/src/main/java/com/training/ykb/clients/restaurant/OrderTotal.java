package com.training.ykb.clients.restaurant;


public class OrderTotal {

    private long orderId;
    private long amount;


    public OrderTotal() {
    }

    public OrderTotal(final long orderIdParam,
                      final long amountParam) {
        super();
        this.orderId = orderIdParam;
        this.amount = amountParam;
    }

    public long getOrderId() {
        return this.orderId;
    }

    public void setOrderId(final long orderIdParam) {
        this.orderId = orderIdParam;
    }

    public long getAmount() {
        return this.amount;
    }

    public void setAmount(final long amountParam) {
        this.amount = amountParam;
    }


}
