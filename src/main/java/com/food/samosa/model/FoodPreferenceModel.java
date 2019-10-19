package com.food.samosa.model;

public class FoodPreferenceModel extends BaseModel {

    private String userID;

    private String foodID;

    private int selectionFrequency;

    private UserModel user;


    private FoodModel food;

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

    public void setSelectionFrequency(int selectionFrequency) {
        this.selectionFrequency = selectionFrequency;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public FoodModel getFood() {
        return food;
    }

    public void setFood(FoodModel food) {
        this.food = food;
    }

}
