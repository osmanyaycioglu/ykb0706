package com.training.ykb.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer/data")
public class CustomerDataRest2 {

    @GetMapping("/getall")
    public List<Customer> getAll() {
        return null;
    }

    @GetMapping("/deleteall")
    public List<Customer> delleteAll() {
        return null;
    }


}
