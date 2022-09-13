package com.example.app.RestFlowerShopMySQL.service;

import com.example.app.RestFlowerShopMySQL.models.Flower;
import com.example.app.RestFlowerShopMySQL.repository.FlowerRepository;
import com.example.app.RestFlowerShopMySQL.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerService {

    @Autowired
    FlowerRepository repository;

    public List<Flower> findAll() {
        return repository.findAll().stream()
                .map(flower -> new Flower(flower.getId(), flower.getName(), Constants.IMAGE_URL + flower.getPhoto(), flower.getDescription(), flower.getPrice())).toList();
    }
}
