package com.palmarcell.recipeapp.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by gemboly on 2018. 06. 22., 2018
 */
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO  )
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }
}