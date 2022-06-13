package com.mycompany.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "inventory-service", decode404 = true)
public interface InventoryClient {

    @GetMapping("/item")
    public String getItem();
}
