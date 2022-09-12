package com.example.app.RestFlowerShopMySQL.repository;

import com.example.app.RestFlowerShopMySQL.models.Flower;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlowerRepository extends CrudRepository<Flower, Integer> {
    List<Flower> findAll();
}
