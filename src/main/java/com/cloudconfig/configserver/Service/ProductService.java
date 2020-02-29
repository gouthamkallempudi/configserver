package com.cloudconfig.configserver.Service;

import com.cloudconfig.configserver.Model.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@Slf4j
@Transactional
public class ProductService{
    private ProductServiceImpl productRepository;

    @Autowired
    public ProductService(ProductServiceImpl productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> findAllProducts(){
        return productRepository.findAll();
    }

    public Optional<Product> findProductByCode(String code){
        return productRepository.findByCode(code);
    }
}
