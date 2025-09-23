package com.Product.Product.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Product {
    @Id
    private int Id;
    private int productId;
    private String productName;
    private String description;
    private int forSale;
}
