package com.pragma.inventory.repository;

import com.pragma.inventory.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {}