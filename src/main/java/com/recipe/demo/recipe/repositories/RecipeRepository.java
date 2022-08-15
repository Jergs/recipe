package com.recipe.demo.recipe.repositories;

import com.recipe.demo.recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
