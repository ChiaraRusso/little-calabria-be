package com.littleitaly.littleitalybe.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "desserts")
public class Dessert extends FoodAbstract {

    public Dessert() {
    }

    public Dessert(Long id, String foodDescription, String foodName, Double foodPrice, String foodImage) {
        super(id,foodDescription, foodName, foodPrice, foodImage);
    }
}
