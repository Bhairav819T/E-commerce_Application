package com.pro1.EcomApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pro1.EcomApp.entity.Product;

@Repository
public interface productrepository extends MongoRepository<Product,String>{

}
