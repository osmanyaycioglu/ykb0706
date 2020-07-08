package com.training.ykb;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("account")
@RequestMapping("/account")
public interface IAccountCient {

    @PostMapping("/pay")
    public String payment(@RequestBody final CustomerPayment paymentParam);
}
