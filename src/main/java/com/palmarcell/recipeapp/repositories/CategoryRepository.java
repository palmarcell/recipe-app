package com.palmarcell.recipeapp.repositories;

import com.palmarcell.recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by gemboly on 2018. 06. 22., 2018
 */
public interface CategoryRepository extends CrudRepository<Category,Long> {


}
