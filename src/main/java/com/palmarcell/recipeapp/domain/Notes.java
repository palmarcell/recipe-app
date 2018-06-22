package com.palmarcell.recipeapp.domain;

import lombok.*;

import javax.persistence.*;

/**
 * Created by gemboly on 2018. 06. 21., 2018
 */
@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;
}
