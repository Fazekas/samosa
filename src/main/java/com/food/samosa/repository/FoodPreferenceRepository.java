package com.food.samosa.repository;

import com.food.samosa.entity.FoodPreferenceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodPreferenceRepository extends JpaRepository<FoodPreferenceEntity, String> {
}
