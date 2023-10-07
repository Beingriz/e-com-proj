package com.example.ecomproj.repository;

import com.example.ecomproj.models.Orders;
import com.example.ecomproj.models.Product;
import com.example.ecomproj.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepositoy extends JpaRepository<Orders, Integer> {

}
