package com.training.ykb.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer/withdraw")
public class CustomerAccountRest {

    @PostMapping
    public String addCustomer(@RequestBody final Customer customerParam) {
        return "OK";
    }

}
