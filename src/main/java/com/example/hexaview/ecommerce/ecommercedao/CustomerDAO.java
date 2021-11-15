package com.example.hexaview.ecommerce.ecommercedao;

import com.example.hexaview.ecommerce.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDAO extends CrudRepository<Customer, Integer> {

}
