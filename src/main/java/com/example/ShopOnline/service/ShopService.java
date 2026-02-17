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

    // Найти все товары
    public Iterable<Product> findAll() {
        return shopRepository.findAll();
    }

    // Найти один по ID
    public Optional<Product> findById(Long id) {
        return shopRepository.findById(id);
    }

    // Сохранить или обновить
    public Product save(Product product) {
        return shopRepository.save(product);
    }

    // Удалить по ID
    public void delete(Long id) {
        shopRepository.deleteById(id);
    }

    // Проверить, существует ли товар (для update/delete)
    public boolean exists(Long id) {
        return shopRepository.existsById(id);
    }

    // Сбросить всю таблицу
    public void resetTable() {
        shopRepository.resetTable();
    }
}