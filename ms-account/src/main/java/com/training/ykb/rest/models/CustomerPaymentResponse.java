package com.training.ykb.rest.models;


public class CustomerPaymentResponse {

    private long   customerId;
    private String customerName;
    private String email;
    private String cellNumber;

    public long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(final long customerIdParam) {
        this.customerId = customerIdParam;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(final String emailParam) {
        this.email = emailParam;
    }

    public String getCellNumber() {
        return this.cellNumber;
    }

    public void setCellNumber(final String cellNumberParam) {
        this.cellNumber = cellNumberParam;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerNameParam) {
        customerName = customerNameParam;
    }

}
