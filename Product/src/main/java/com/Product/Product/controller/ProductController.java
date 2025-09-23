package com.Product.Product.controller;

import com.Product.Product.dto.ProductDto;
import com.Product.Product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/getproducts")
    public List<ProductDto> getAllProducts(){
        return productService.getAllProducts();
    }

    @RequestMapping("/product/{productId}")
    public ProductDto getProduct(@PathVariable Integer productId){
        return productService.getProductById(productId);
    }

    @PostMapping("/addProduct")
    public ProductDto saveProduct(@RequestBody ProductDto productDto){
        return productService.saveProduct(productDto);
    }

    @PutMapping("/updateproduct")
    public ProductDto updateProduct(@RequestBody ProductDto productDto){
        return productService.updateProduct(productDto);
    }

    @DeleteMapping("/deleteProduct/{productId}")
    public String deleteProduct(@PathVariable Integer productId){
        return productService.deleteProduct(productId);
    }
}
