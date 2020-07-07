package com.training.ykb.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer/data/all")
public class CustomerDataRest {

    @GetMapping
    public List<Customer> getAll() {
        return null;
    }

    @DeleteMapping
    public List<Customer> delleteAll() {
        return null;
    }


}
