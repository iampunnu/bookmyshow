package com.project.bookmyshow.controller;

import com.project.bookmyshow.Services.TicketService;
import com.project.bookmyshow.dto.BookTicketRequestDto;
import com.project.bookmyshow.dto.BookTicketResponseDto;
import com.project.bookmyshow.exception.ShowSeatNotAvailableException;
import com.project.bookmyshow.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class TicketController {
    private TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public BookTicketResponseDto bookTicket(BookTicketRequestDto request) {
        Long showId = request.getShowId();;
        List<Long> showSeatIds = request.getShowSeatIds();

        try {
            Ticket ticket = ticketService.bookTicket(
                    showId,
                    showSeatIds
            );

            BookTicketResponseDto response = new BookTicketResponseDto();
            response.setStatus("SUCCESS");
            response.setTicket(ticket);

            return response;
        } catch (ShowSeatNotAvailableException exception) {
            BookTicketResponseDto response = new BookTicketResponseDto();
            response.setStatus("FAILURE");

            return response;
        }
    }
}
