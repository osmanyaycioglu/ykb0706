package com.training.ykb.service.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.ykb.models.Customer;
import com.training.ykb.rest.models.CustomerPayment;
import com.training.ykb.rest.models.CustomerPaymentResponse;
import com.training.ykb.service.customer.CustomerManager;

@Service
public class AccountManager {

    @Autowired
    private CustomerManager cm;

    public CustomerPaymentResponse pay(final CustomerPayment cp) {
        Customer customerLoc = this.cm.getCustomer(cp.getCustomerId());
        if (customerLoc == null) {
            throw new IllegalStateException("Böyle bir customer yok");
        }
        CustomerPaymentResponse cpr = new CustomerPaymentResponse();
        cpr.setCustomerName(customerLoc.getName());
        cpr.setCellNumber(customerLoc.getCellNumber());
        cpr.setCustomerId(cp.getCustomerId());
        cpr.setEmail(customerLoc.getEmail());
        return cpr;
    }

}
