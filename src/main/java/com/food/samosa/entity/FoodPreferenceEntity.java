package com.food.samosa.entity;

import javax.persistence.*;

@Entity
@Table(name ="food_preference")
public class FoodPreferenceEntity extends BaseEntity {
    @Column(length = 50)
    private String userID;

    @Column(length = 50)
    private String foodID;

    @Column
    private int selectionFrequency;

    @ManyToOne
    @JoinColumn(name="user_ID")
    private UserEntity userEntity;

    @ManyToOne
    @JoinColumn(name ="food_ID")
    private FoodEntity foodEntity;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getFoodID() {
        return foodID;
    }

    public void setFoodID(String foodID) {
        this.foodID = foodID;
    }

    public int getSelectionFrequency() {
        return selectionFrequency;
    }

    public void setSelectionFrequency(int slectionFrquency) {
        this.selectionFrequency = slectionFrquency;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public FoodEntity getFoodEntity() {
        return foodEntity;
    }

    public void setFoodEntity(FoodEntity foodEntity) {
        this.foodEntity = foodEntity;
    }
}
