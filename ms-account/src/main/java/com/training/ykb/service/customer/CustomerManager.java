package com.training.ykb.service.customer;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.training.ykb.models.Customer;

@Service
public class CustomerManager {

    private final Map<Long, Customer> customerStorage = new HashMap<>();

    @PostConstruct
    public void init() {
        Customer customerLoc1 = new Customer(1,
                                             "osman yaycıoğlu",
                                             "4912057015152525",
                                             "05435022222",
                                             "osmanyaycioglu@gmail.com");
        this.customerStorage.put(1L,
                                 customerLoc1);
        Customer customerLoc2 = new Customer(2,
                                             "mehmet alli",
                                             "4912057015152526",
                                             "05424044444",
                                             "mehmetali@gmail.com");
        this.customerStorage.put(2L,
                                 customerLoc2);
        Customer customerLoc3 = new Customer(3,
                                             "Ayse Arman",
                                             "4912057015152527",
                                             "054177877909",
                                             "aysearman@gmail.com");
        this.customerStorage.put(3L,
                                 customerLoc3);
    }

    public Customer getCustomer(final long customerId) {
        return this.customerStorage.get(customerId);
    }
}
