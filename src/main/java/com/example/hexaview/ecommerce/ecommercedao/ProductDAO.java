package com.example.hexaview.ecommerce.ecommercedao;

import com.example.hexaview.ecommerce.model.ProductModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDAO extends CrudRepository<ProductModel,Integer> {
    @Override
    List<ProductModel> findAll();
}
