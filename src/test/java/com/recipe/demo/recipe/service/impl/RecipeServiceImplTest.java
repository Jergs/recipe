package com.recipe.demo.recipe.service.impl;

import com.recipe.demo.recipe.domain.Recipe;
import com.recipe.demo.recipe.repositories.RecipeRepository;
import com.recipe.demo.recipe.service.RecipeService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.openMocks;

class RecipeServiceImplTest {

    @Mock
    private RecipeRepository recipeRepository;
    private AutoCloseable closeable;

    private RecipeService recipeService;

    @BeforeEach
    public void setUp() {
        closeable = openMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepository);
    }

    @AfterEach
    public void closeService() throws Exception {
        closeable.close();
    }

    @Test
    void getRecipes() {
        Recipe recipe = new Recipe();
        Set<Recipe> recipeSet = new HashSet<>();
        recipeSet.add(recipe);
        when(recipeRepository.findAll()).thenReturn(recipeSet);

        Set<Recipe> recipies = recipeService.getRecipes();
        assertEquals(1, recipies.size());
        verify(recipeRepository, times(1)).findAll();
    }
}