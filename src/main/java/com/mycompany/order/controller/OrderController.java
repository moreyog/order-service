package com.mycompany.order.controller;

import com.mycompany.order.client.InventoryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    InventoryClient inventoryClient;

    @GetMapping("/order")
    public String getOrder(){
        System.out.println("list orders");
        return "Order : " + inventoryClient.getItem();
    }

    @GetMapping("/order/1")
    public String getOrder1(){
        System.out.println("list orders");
        return "Order No : 1";
    }

    @PostMapping
    public void placeOrder(){
        System.out.println("received orders");
    }
}
