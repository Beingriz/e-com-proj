package com.example.ecomproj.controller;

import com.example.ecomproj.models.Product;
import com.example.ecomproj.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("/orderForProductwithA")
    public List<String> orderForProductwithA(){
        return orderService.orderForProductwithA();
    }
}
