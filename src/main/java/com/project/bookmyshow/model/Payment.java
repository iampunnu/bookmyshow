package com.project.bookmyshow.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{
    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;
    private String thirdPartyRefId;
}
