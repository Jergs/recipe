package com.recipe.demo.recipe.service.impl;

import com.recipe.demo.recipe.domain.Recipe;
import com.recipe.demo.recipe.repositories.RecipeRepository;
import com.recipe.demo.recipe.service.RecipeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@AllArgsConstructor
@Slf4j
public class RecipeServiceImpl implements RecipeService {

    private RecipeRepository recipeRepository;

    @Override
    public Set<Recipe> getRecipes() {
        log.debug("I'm in the recipe service");

        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }

    @Override
    public Recipe findById(Long l) {
        Optional<Recipe> recipeOptional = recipeRepository.findById(l);
        return recipeOptional.orElseThrow(() -> new RuntimeException("Recipe Not Found!"));
    }
}
