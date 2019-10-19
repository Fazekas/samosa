package com.food.samosa.model;

public class CategoryModel extends BaseModel{

    private String categoryName;

    private FoodModel food;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public FoodModel getFood() {
        return food;
    }

    public void setFood(FoodModel food) {
        this.food = food;
    }
}
