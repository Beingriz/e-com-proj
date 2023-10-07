package com.example.ecomproj.controller;

import com.example.ecomproj.DTO.ProductResponse;
import com.example.ecomproj.models.Product;
import com.example.ecomproj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/add")
    public String addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @GetMapping("/max-price-product")
    public ProductResponse getMaxPriceProduct(){
        return productService.getMaxPriceProduct();
    }


//    @GetMapping("/most-ordered-product")
//    public ProductResponse mostOrderedProduct(){
//        return productService.mostOrderedProduct();
//    }
//

}
