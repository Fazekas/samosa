package com.food.samosa.mapper;

import com.food.samosa.entity.CategoryEntity;
import com.food.samosa.model.CategoryModel;

public class CategoryMapper implements EntityModelMapper<CategoryEntity, CategoryModel> {
    @Override
    public CategoryEntity modelToEntity(CategoryModel categoryModel) {
        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setCategory_Name(categoryModel.getCategoryName());
        return categoryEntity;
    }

    @Override
    public CategoryModel entityToModel(CategoryEntity categoryEntity) {
        CategoryModel categoryModel = new CategoryModel();
        categoryModel.setCategoryName(categoryEntity.getCategory_Name());
        categoryModel.setId(categoryEntity.getId());

        return categoryModel;

    }
}
