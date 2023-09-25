package com.project.bookmyshow.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class ShowSeatType extends BaseModel{
    @ManyToOne
    // 1:1
    // m:1
    private Show show;

    // SST:ST
    @ManyToOne
    // 1:1
    // m:1
    private SeatType seatType;
    private double price;
}
