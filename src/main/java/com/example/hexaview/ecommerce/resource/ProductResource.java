package com.example.hexaview.ecommerce.resource;

import com.example.hexaview.ecommerce.model.ProductModel;
import com.example.hexaview.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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
    @GetMapping(value = "/{ProductID}")
    public ProductModel getProductById(@PathVariable("ProductID") int id){
        return productService.getProductByID(id);
    }
    @PutMapping(value = "/{productid}")
    public ProductModel updateProduct(@PathVariable("productid") int id, @RequestBody ProductModel product){
        return productService.updateProduct(id,product);
    }
    @DeleteMapping(value = "/{productid}")
    public void deleteProduct(@PathVariable("productid") int id){
        productService.deleteProduct(id);
    }
}
