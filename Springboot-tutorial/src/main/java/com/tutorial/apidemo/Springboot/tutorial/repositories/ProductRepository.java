package com.tutorial.apidemo.Springboot.tutorial.repositories;

import com.tutorial.apidemo.Springboot.tutorial.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
