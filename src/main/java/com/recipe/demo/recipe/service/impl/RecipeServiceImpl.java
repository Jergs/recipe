package com.recipe.demo.recipe.service.impl;

import com.recipe.demo.recipe.domain.Recipe;
import com.recipe.demo.recipe.repositories.RecipeRepository;
import com.recipe.demo.recipe.service.RecipeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
public class RecipeServiceImpl implements RecipeService {

    private RecipeRepository recipeRepository;

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
}
