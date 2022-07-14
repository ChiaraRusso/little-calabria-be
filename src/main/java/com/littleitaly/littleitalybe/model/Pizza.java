package com.littleitaly.littleitalybe.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pizze")
public class Pizza extends FoodAbstract {

    public Pizza() {
    }

    public Pizza(Long id, String foodDescription, String foodName, Double foodPrice, String foodImage) {
        super(id, foodDescription, foodName, foodPrice, foodImage);
    }
}
