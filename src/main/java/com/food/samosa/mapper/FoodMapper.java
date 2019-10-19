package com.food.samosa.mapper;

import com.food.samosa.entity.FoodEntity;
import com.food.samosa.model.CategoryModel;
import com.food.samosa.model.FoodModel;
import com.food.samosa.model.FoodPreferenceModel;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

public class FoodMapper implements EntityModelMapper<FoodEntity, FoodModel> {

    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private FoodPreferenceMapper foodPreferenceMapper;

    @Override
    public FoodEntity modelToEntity(FoodModel food) {
        FoodEntity foodEntity = new FoodEntity();
        foodEntity.setImageURL(food.getImageURL());
        foodEntity.setCategoryName(food.getCategoryName());
        foodEntity.setBusinessID(food.getBusinessID());


        return foodEntity;
    }

    @Override
    public FoodModel entityToModel(FoodEntity foodEntity) {
        FoodModel food = new FoodModel();
        food.setImageURL(foodEntity.getImageURL());
        food.setBusinessID(foodEntity.getBusinessID());
        food.setCategoryName(foodEntity.getCategoryName());
        food.setId(foodEntity.getId());

        Set<CategoryModel> categoryModels = new HashSet<>();

        foodEntity.getCategories().forEach( c -> {
            CategoryModel category = categoryMapper.entityToModel(c);
            categoryModels.add(category);
        });

        food.setCategories(categoryModels);

        Set<FoodPreferenceModel> foodPreferenceModels = new HashSet<>();

        foodEntity.getFoodPreferenceEntities().forEach(f -> {
            FoodPreferenceModel foodPreferenceModel =foodPreferenceMapper.entityToModel(f);
            foodPreferenceModels.add(foodPreferenceModel);

        });
        food.setFoodPreferences(foodPreferenceModels);
        return food;

    }
}
