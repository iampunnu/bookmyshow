package com.project.bookmyshow.model;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Show extends BaseModel{
    @ManyToOne
    private Auditorium auditorium;
    @Column

    private Date startTime;
    @Column

    private Date endTime;

    // S:M
    @ManyToOne
    private Movie movie;

    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<Feature> features;
}
