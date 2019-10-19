package com.food.samosa.mapper;

import com.food.samosa.entity.FoodPreferenceEntity;
import com.food.samosa.model.FoodPreferenceModel;

public class FoodPreferenceMapper implements EntityModelMapper<FoodPreferenceEntity, FoodPreferenceModel> {


    @Override
    public FoodPreferenceEntity modelToEntity(FoodPreferenceModel foodPreferenceModel) {
        FoodPreferenceEntity foodPreferenceEntity = new FoodPreferenceEntity();
        foodPreferenceEntity.setFoodID(foodPreferenceModel.getFoodID());
        foodPreferenceEntity.setSelectionFrequency(foodPreferenceModel.getSelectionFrequency());
        foodPreferenceEntity.setUserID(foodPreferenceModel.getUserID());

        return foodPreferenceEntity;
    }

    @Override
    public FoodPreferenceModel entityToModel(FoodPreferenceEntity foodPreferenceEntity) {
        FoodPreferenceModel foodPreferenceModel = new FoodPreferenceModel();
        foodPreferenceModel.setFoodID(foodPreferenceEntity.getFoodID());
        foodPreferenceModel.setUserID(foodPreferenceEntity.getUserID());
        foodPreferenceModel.setSelectionFrequency(foodPreferenceEntity.getSelectionFrequency());
        foodPreferenceModel.setId(foodPreferenceModel.getId());
        return foodPreferenceModel;
    }
}
