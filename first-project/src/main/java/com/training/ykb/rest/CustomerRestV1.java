package com.training.ykb.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer/provision/v1")
public class CustomerRestV1 {

    @PostMapping("/add")
    public String addCustomer(@RequestBody final Customer customerParam) {
        return "OK";
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("customerId") final long customerId) {
        return "OK";
    }

    @PostMapping("/update")
    public String updateCustomer(@RequestBody final Customer customerParam) {
        return "OK";
    }

    @GetMapping("/getall")
    public List<Customer> getAll() {
        return null;
    }

    @GetMapping("/deleteall")
    public List<Customer> deleteAll() {
        return null;
    }

    @GetMapping("/xyz")
    public List<Customer> xyz() {
        return null;
    }

}

