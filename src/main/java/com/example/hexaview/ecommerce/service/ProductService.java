package com.example.hexaview.ecommerce.service;

import com.example.hexaview.ecommerce.ecommercedao.ProductDAO;
import com.example.hexaview.ecommerce.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {
    @Autowired
    private ProductDAO productdao;

    public ProductModel addProduct(ProductModel product){
        return productdao.save(product);
    }

    public List<ProductModel> getProducts(){
        return productdao.findAll();
    }

    public ProductModel getProductByID(int id){
        return productdao.findById(id).get();
    }

    public ProductModel updateProduct(int id,ProductModel product){
        product.setId(id);
        return productdao.save(product);
    }

    public void deleteProduct(int id){
        productdao.deleteById(id);
    }
}
