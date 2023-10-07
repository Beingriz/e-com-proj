package com.example.ecomproj.DTO;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductResponse {

    private  String prductName;
    private  double price;
    private String category;

}
