package com.example.ShopOnline.service;

import com.example.ShopOnline.model.Product;
import com.example.ShopOnline.repo.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ShopService {

    @Autowired
    private ShopRepository shopRepository;


    public Iterable<Product> findAll() {
        return shopRepository.findAll();
    }


    public Optional<Product> findById(Long id) {
        return shopRepository.findById(id);
    }


    public Product save(Product product) {
        return shopRepository.save(product);
    }


    public void delete(Long id) {
        shopRepository.deleteById(id);
    }


    public boolean exists(Long id) {
        return shopRepository.existsById(id);
    }


    public void resetTable() {
        shopRepository.resetTable();
    }
}