package com.project.bookmyshow.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class SeatType extends BaseModel{
    private String name;

}
