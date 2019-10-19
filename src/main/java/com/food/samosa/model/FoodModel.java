package com.food.samosa.model;

import java.util.Set;

public class FoodModel extends BaseModel {

    private String imageURL;

    private String categoryName;

    private String businessID;

    private Set<FoodPreferenceModel> foodPreferences;

    private Set<CategoryModel> categories;

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getBusinessID() {
        return businessID;
    }

    public void setBusinessID(String businessID) {
        this.businessID = businessID;
    }

    public Set<FoodPreferenceModel> getFoodPreferences() {
        return foodPreferences;
    }

    public void setFoodPreferences(Set<FoodPreferenceModel> foodPreferences) {
        this.foodPreferences = foodPreferences;
    }

    public Set<CategoryModel> getCategories() {
        return categories;
    }

    public void setCategories(Set<CategoryModel> categories) {
        this.categories = categories;
    }
}
