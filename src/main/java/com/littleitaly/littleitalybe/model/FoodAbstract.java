package com.littleitaly.littleitalybe.model;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class FoodAbstract {

    @Id
    private Long id;

    @Column(name = "foodDescription")
    private String foodDescription;

    @Column(name = "foodName")
    private String foodName;

    @Column(name = "foodPrice")
    private Double foodPrice;

    @Column(name = "foodImage")
    private String foodImage;

    @Column(name = "quantity")
    private Integer quantity;

    public FoodAbstract() {
    }

    public FoodAbstract(Long id, String foodDescription, String foodName, Double foodPrice, String foodImage) {
        this.id = id;
        this.foodDescription = foodDescription;
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.foodImage = foodImage;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public Double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(Double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public String getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(String foodImage) {
        this.foodImage = foodImage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
