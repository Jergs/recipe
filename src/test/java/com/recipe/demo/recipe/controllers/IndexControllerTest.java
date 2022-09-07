package com.recipe.demo.recipe.controllers;

import com.recipe.demo.recipe.service.RecipeService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.openMocks;

class IndexControllerTest {

    private AutoCloseable closeable;
    @Mock
    private RecipeService recipeService;
    @Mock
    private Model model;
    @InjectMocks
    private IndexController indexController;

    @BeforeEach
    public void setUp() {
        closeable = openMocks(this);
    }

    @AfterEach
    public void after() throws Exception {
        closeable.close();
    }

    @Test
    void getIndexPage() {
        String viewName = indexController.getIndexPage(model);
        assertEquals("index", viewName);
        verify(recipeService, times(1)).getRecipes();
        verify(model, times(1)).addAttribute(eq("recipes"), anySet());
    }
}