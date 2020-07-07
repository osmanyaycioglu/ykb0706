package com.training.ykb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountRest {

    @Value("${server.port}")
    private int port;

    @PostMapping("/pay")
    public String payment(@RequestBody final CustomerPayment paymentParam) {
        return "OK " + this.port;
    }

}
