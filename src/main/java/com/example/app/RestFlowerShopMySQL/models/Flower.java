package com.example.app.RestFlowerShopMySQL.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "flowers")
public class Flower {

    public Flower() {
    }

    public Flower(int id, String name, String photo, String description, float price) {
        this.id = id;
        this.name = name;
        this.photo = photo;
        this.description = description;
        this.price = price;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private String photo;

    private String description;

    private float price;
}
