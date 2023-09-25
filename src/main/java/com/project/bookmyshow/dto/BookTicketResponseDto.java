package com.project.bookmyshow.dto;

import com.project.bookmyshow.model.Ticket;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookTicketResponseDto {
    private String status;
    private Ticket ticket;
}
