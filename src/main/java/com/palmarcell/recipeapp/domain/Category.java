package com.palmarcell.recipeapp.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by gemboly on 2018. 06. 22., 2018
 */
@Data
@EqualsAndHashCode(exclude = {"recipes"})
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}
