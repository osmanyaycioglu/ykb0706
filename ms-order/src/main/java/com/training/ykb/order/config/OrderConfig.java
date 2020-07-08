package com.training.ykb.order.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class OrderConfig {

    @Bean
    @LoadBalanced
    @Qualifier("loadbalanced")
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    @Qualifier("direct")
    public RestTemplate directRestTemplate() {
        return new RestTemplate();
    }

}
