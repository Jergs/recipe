package com.recipe.demo.recipe.service.impl;

import com.recipe.demo.recipe.domain.Category;
import com.recipe.demo.recipe.repositories.CategoryRepository;
import com.recipe.demo.recipe.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    @Override
    public Category getCategoryByDescription(String description) {
        Optional<Category> categoryOpt = categoryRepository.findByDescription(description);
        return categoryOpt.orElseThrow();
    }
}
