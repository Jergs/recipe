package com.recipe.demo.recipe.service;

import com.recipe.demo.recipe.domain.Category;

public interface CategoryService {

    Category getCategoryByDescription(String description);
}
