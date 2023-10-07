package com.example.ecomproj.models;

import com.example.ecomproj.Enum.Category;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    private String name;

    @Enumerated(EnumType.STRING)
    private Category category;
    private double price;

    @ManyToOne
    @JoinColumn
    private User user;

    @ManyToMany(mappedBy = "products", cascade = CascadeType.ALL)
    private List<Orders> orders;
}
