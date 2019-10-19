package com.food.samosa.service;

import com.food.samosa.mapper.CategoryMapper;
import com.food.samosa.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private CategoryRepository categoryRepository;


}
