package com.food.samosa.mapper;

import com.food.samosa.entity.FoodPreferenceEntity;
import com.food.samosa.entity.UserEntity;
import com.food.samosa.model.FoodPreferenceModel;
import com.food.samosa.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class UserMapper implements EntityModelMapper<UserEntity, UserModel> {

    @Autowired
    private FoodPreferenceMapper foodPreferenceMapper;

    @Override
    public UserEntity modelToEntity( UserModel user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setFirstName(user.getFirstName());
        userEntity.setLastName(user.getLastName());
        userEntity.setEmail(user.getEmail());
        userEntity.setLocation(user.getLocation());
        userEntity.setPassword(user.getPassword());
        userEntity.setNumSelection(user.getNumSelection());
       // userEntity.setFoodPreferenceEntities(user.getFoodPreferences());
//
//        Set<FoodPreferenceEntity> foodPreferenceEntities = new HashSet<>();



        return userEntity;
    }

    public UserModel entityToModel( UserEntity userEntity) {
        UserModel userModel = new UserModel();
        userModel.setFirstName(userEntity.getFirstName());
        userModel.setLastName(userEntity.getLastName());
        userModel.setEmail(userEntity.getEmail());
        userModel.setPassword(userEntity.getPassword());
        userModel.setLocation(userEntity.getLocation());
        userModel.setNumSelection(userEntity.getNumSelection());
        userModel.setId(userEntity.getId());


        Set<FoodPreferenceModel> foodPreferenceModels = new HashSet<>();

        userEntity.getFoodPreferenceEntities().forEach( f -> {
            FoodPreferenceModel foodPreferenceModel = foodPreferenceMapper.entityToModel(f);
            foodPreferenceModels.add(foodPreferenceModel);
        });

        userModel.setFoodPreferences(foodPreferenceModels);

        return userModel;
    }
}
