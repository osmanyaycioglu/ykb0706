package com.training.ykb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;

@RestController
@RequestMapping("/order")
public class OrderRest {

    @Autowired
    private EurekaClient  ec;

    @Autowired
    @Qualifier("loadbalanced")
    private RestTemplate  rt;

    @Autowired
    @Qualifier("direct")
    private RestTemplate  drt;

    @Autowired
    private IAccountCient ac;

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

    @PostMapping("/test2")
    public String test2() {
        Application applicationLoc = this.ec.getApplication("ACCOUNT");
        List<InstanceInfo> instancesLoc = applicationLoc.getInstances();
        for (InstanceInfo instanceInfoLoc : instancesLoc) {
            System.out.println(instanceInfoLoc);
        }
        InstanceInfo instanceInfoLoc = instancesLoc.get(0);
        String ipAddrLoc = instanceInfoLoc.getIPAddr();
        int portLoc = instanceInfoLoc.getPort();

        CustomerPayment cp = new CustomerPayment();
        cp.setCustomerId(1);
        cp.setAmount(100);
        String postForObjectLoc = this.drt.postForObject("http://" + ipAddrLoc + ":" + portLoc + "/account/pay",
                                                         cp,
                                                         String.class);
        return postForObjectLoc;
    }

    @PostMapping("/test3")
    public String test3() {
        InstanceInfo nextServerFromEurekaLoc = this.ec.getNextServerFromEureka("ACCOUNT",
                                                                               false);
        CustomerPayment cp = new CustomerPayment();
        cp.setCustomerId(1);
        cp.setAmount(100);
        String postForObjectLoc = this.drt.postForObject("http://"
                                                         + nextServerFromEurekaLoc.getIPAddr()
                                                         + ":"
                                                         + nextServerFromEurekaLoc.getPort()
                                                         + "/account/pay",
                                                         cp,
                                                         String.class);
        return postForObjectLoc;
    }

    @PostMapping("/test4")
    public String test4() {
        CustomerPayment cp = new CustomerPayment();
        cp.setCustomerId(1);
        cp.setAmount(100);
        return this.ac.payment(cp);
    }

}
