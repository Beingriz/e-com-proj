package com.example.ecomproj.service;

import com.example.ecomproj.models.Orders;
import com.example.ecomproj.models.Product;
import com.example.ecomproj.repository.OrderRepositoy;
import com.example.ecomproj.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class OrderService {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    OrderRepositoy orderRepositoy;
    public List<String> orderForProductwithA() {
        List<String> productNames = new ArrayList<>();
        List<Product> productList  =  productRepository.findAll();

        for (Product product: productList ) {
            if(product.getName().startsWith("A")){
                Orders newOrder = new Orders();
                newOrder.setOrderId(String.valueOf(UUID.randomUUID()));
                newOrder.getProducts().add(product);
                orderRepositoy.save(newOrder);
                productRepository.save(product);
                productNames.add(product.getName());
            }
        }
        return productNames;

    }
}
