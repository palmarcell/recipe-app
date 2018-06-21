package com.palmarcell.recipeapp.repositories;

import com.palmarcell.recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by gemboly on 2018. 06. 22., 2018
 */
public interface RecipeRepository extends CrudRepository<Recipe,Long> {


}
