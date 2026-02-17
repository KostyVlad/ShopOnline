package com.example.ShopOnline.repo;

import com.example.ShopOnline.model.Product;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ShopRepository extends CrudRepository<Product, Long> {


    @Modifying
    @Transactional
    @Query(value = "TRUNCATE TABLE products RESTART IDENTITY", nativeQuery = true)
    void resetTable();
}