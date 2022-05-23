package com.littleitaly.littleitalybe.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "second_courses")
public class SecondCourse extends FoodAbstract {

    public SecondCourse() {
    }

    public SecondCourse(Long id, String foodDescription, String foodName, Double foodPrice, String foodImage) {
        super(id, foodDescription, foodName, foodPrice, foodImage);
    }
}
