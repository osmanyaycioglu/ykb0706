package com.training.ykb;


public class CustomerPaymentResponse {

    private long   customerId;
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

}
