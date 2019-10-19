package com.food.samosa.repository;

import com.food.samosa.entity.FoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodRepository extends JpaRepository<FoodEntity, String> {
    List<FoodEntity> findAllByCategory(String categoryName);
}
