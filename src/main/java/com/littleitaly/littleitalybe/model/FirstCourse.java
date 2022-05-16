package com.littleitaly.littleitalybe.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "firstCourses")
public class FirstCourse extends FoodAbstract {

    public FirstCourse() {
    }

    public FirstCourse(Long id, String foodDescription, String foodName, Double foodPrice, String foodImage) {
        super(id, foodDescription, foodName, foodPrice, foodImage);
    }
}
