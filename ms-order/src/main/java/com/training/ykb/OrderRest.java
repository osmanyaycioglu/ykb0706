package com.training.ykb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderRest {

    @Autowired
    private RestTemplate rt;

    @PostMapping("/test")
    public String test() {
        CustomerPayment cp = new CustomerPayment();
        cp.setCustomerId(1);
        cp.setAmount(100);
        String postForObjectLoc = this.rt.postForObject("http://ACCOUNT/account/pay",
                                                        cp,
                                                        String.class);
        return postForObjectLoc;
    }

}
