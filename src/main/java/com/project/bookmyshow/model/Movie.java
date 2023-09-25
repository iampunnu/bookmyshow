package com.project.bookmyshow.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel{
    private String name;

    // M:A
    @ManyToMany
    private List<Actor> actors;
}
