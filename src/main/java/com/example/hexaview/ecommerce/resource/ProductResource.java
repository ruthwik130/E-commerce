package com.example.hexaview.ecommerce.resource;

import com.example.hexaview.ecommerce.model.ProductModel;
import com.example.hexaview.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
    @Autowired
    private ProductService productService;
    @PostMapping
    public ProductModel addProduct(@RequestBody ProductModel product){
        return productService.addProduct(product);
    }
    @GetMapping
    public List<ProductModel> getProducts(){
        return productService.getProducts();
    }
}
