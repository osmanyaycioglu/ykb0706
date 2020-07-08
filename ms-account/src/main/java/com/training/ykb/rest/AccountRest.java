package com.training.ykb.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.ykb.rest.models.CustomerPayment;
import com.training.ykb.rest.models.CustomerPaymentResponse;
import com.training.ykb.service.account.AccountManager;

@RestController
@RequestMapping("/account")
public class AccountRest {

    @Value("${server.port}")
    private int            port;

    @Autowired
    private AccountManager account;


    @PostMapping("/pay")
    public CustomerPaymentResponse payment(@Validated @RequestBody final CustomerPayment paymentParam) {
        return this.account.pay(paymentParam);
    }

}
