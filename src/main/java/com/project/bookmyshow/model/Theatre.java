package com.project.bookmyshow.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@Entity
public class Theatre extends BaseModel{
    private String name;
    private String address;
    // T:A
    @OneToMany
    private List<Auditorium> auditoriums;
    private String company;
}
