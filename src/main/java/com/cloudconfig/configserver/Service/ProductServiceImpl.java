package com.cloudconfig.configserver.Service;

import com.cloudconfig.configserver.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductServiceImpl extends JpaRepository<Product, Integer> {
    Optional<Product> findByCode(String code);
}
