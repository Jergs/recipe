package com.recipe.demo.recipe.service;

import com.recipe.demo.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
