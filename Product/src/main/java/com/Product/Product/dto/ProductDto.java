package com.Product.Product.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private int Id;
    private int productId;
    private String productName;
    private String description;
    private int forSale;
}
