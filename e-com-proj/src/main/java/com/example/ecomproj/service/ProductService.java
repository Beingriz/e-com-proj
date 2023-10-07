package com.example.ecomproj.service;

import com.example.ecomproj.DTO.ProductResponse;
import com.example.ecomproj.Enum.Category;
import com.example.ecomproj.models.Product;
import com.example.ecomproj.repository.OrderRepositoy;
import com.example.ecomproj.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    OrderRepositoy orderRepositoy;
    public String addProduct(Product product) {
        Product newproduct = Product.builder()
                .name(product.getName())
                .category(product.getCategory())
                .price(product.getPrice())
                .build();
        productRepository.save(newproduct);
        return " New Product Addedd Succesfully!!..";
    }

    public ProductResponse getMaxPriceProduct() {
        List<Product> productList  = productRepository.findAll();
        double maxPrice  = Integer.MIN_VALUE;
        Product foundProd = null;
        for(Product product : productList){
            if(product.getPrice() > maxPrice){
                maxPrice = product.getPrice();
                foundProd = product;

            }
        }
        ProductResponse productResponse = ProductResponse.builder()
                .prductName(foundProd.getName())
                .category(String.valueOf(foundProd.getCategory()))
                .price(foundProd.getPrice())
                .build();
        return productResponse;

    }


}
