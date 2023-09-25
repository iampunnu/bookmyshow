package com.project.bookmyshow.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    @ManyToOne
    private SeatType seatType;
    private String name;
    @Column
    @NotNull(message = "row number cannot be null")


    private int row;
    @Column
    @NotNull(message = "col number cannot be null")

    private int col;
}
