package com.training.ykb.clients.restaurant;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.training.ykb.order.models.Order;

@FeignClient("restaurant")
@RequestMapping("/restaurant")
public interface IRestaurantClient {

    @PostMapping("/calculate/order")
    public OrderTotal calculate(final Order mor);

}
