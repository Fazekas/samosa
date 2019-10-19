package com.food.samosa.entity;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class CategoryEntity extends BaseEntity {

    @Column
    private String category_Name;

    @ManyToOne
    @JoinColumn(name = "categoryName")
    private FoodEntity foodEntity;

    public String getCategory_Name() {
        return category_Name;
    }

    public void setCategory_Name(String category_Name) {
        this.category_Name = category_Name;
    }

    public FoodEntity getFoodEntity() {
        return foodEntity;
    }

    public void setFoodEntity(FoodEntity foodEntity) {
        this.foodEntity = foodEntity;
    }
}
