package com.training.ykb.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer/provision")
public class CustomerRest {

    @PutMapping
    public String addCustomer(@RequestBody final Customer customerParam) {
        return "OK";
    }

    @DeleteMapping
    public String deleteCustomer(@RequestParam("customerId") final long customerId) {
        return "OK";
    }

    @PatchMapping
    public String updateCustomer(@RequestBody final Customer customerParam) {
        return "OK";
    }


}
