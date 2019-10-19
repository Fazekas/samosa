package com.food.samosa.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "food_entity")
public class FoodEntity extends BaseEntity{

    @Column
    private String imageURL;

    @Column
    private String categoryName;

    @Column
    private String businessID;

    @OneToMany(mappedBy = "foodID")
    private Set<FoodPreferenceEntity> foodPreferenceEntities;

    @OneToMany(mappedBy = "category_Name")
    private Set<CategoryEntity> categories;

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

    public Set<FoodPreferenceEntity> getFoodPreferenceEntities() {
        return foodPreferenceEntities;
    }

    public void setFoodPreferenceEntities(Set<FoodPreferenceEntity> foodPreferenceEntities) {
        this.foodPreferenceEntities = foodPreferenceEntities;
    }

    public Set<CategoryEntity> getCategories() {
        return categories;
    }

    public void setCategories(Set<CategoryEntity> categories) {
        this.categories = categories;
    }
}
