package com.training.ykb.models;


public class Customer {

    private long   customerId;
    private String name;
    private String creditCardNumber;
    private String cellNumber;
    private String email;


    public Customer() {
    }


    public Customer(final long customerIdParam,
                    final String nameParam,
                    final String creditCardNumberParam,
                    final String cellNumberParam,
                    final String emailParam) {
        super();
        this.customerId = customerIdParam;
        this.name = nameParam;
        this.creditCardNumber = creditCardNumberParam;
        this.cellNumber = cellNumberParam;
        this.email = emailParam;
    }


    public long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(final long customerIdParam) {
        this.customerId = customerIdParam;
    }

    public String getCreditCardNumber() {
        return this.creditCardNumber;
    }

    public void setCreditCardNumber(final String creditCardNumberParam) {
        this.creditCardNumber = creditCardNumberParam;
    }

    public String getCellNumber() {
        return this.cellNumber;
    }

    public void setCellNumber(final String cellNumberParam) {
        this.cellNumber = cellNumberParam;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(final String emailParam) {
        this.email = emailParam;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }


}
