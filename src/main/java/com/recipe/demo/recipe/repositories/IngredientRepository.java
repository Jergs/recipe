package com.recipe.demo.recipe.repositories;

import com.recipe.demo.recipe.domain.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, Long> {
}
