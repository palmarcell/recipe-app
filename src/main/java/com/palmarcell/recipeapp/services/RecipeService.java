package com.palmarcell.recipeapp.services;

import com.palmarcell.recipeapp.domain.Recipe;

import java.util.Set;

/**
 * Created by gemboly on 2018. 06. 22., 2018
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
