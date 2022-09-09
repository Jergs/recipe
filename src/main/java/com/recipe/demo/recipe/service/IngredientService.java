package com.recipe.demo.recipe.service;

import com.recipe.demo.recipe.command.IngredientCommand;
import com.recipe.demo.recipe.domain.Ingredient;

import java.util.Set;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);
}
