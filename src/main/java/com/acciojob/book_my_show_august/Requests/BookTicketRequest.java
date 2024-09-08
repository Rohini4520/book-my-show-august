package com.acciojob.book_my_show_august.Requests;

import lombok.Data;

import java.time.LocalTime;
import java.util.List;

@Data
public class BookTicketRequest {

    private String movieName;
    private Integer theaterId;

    private LocalTime showDate;
    private LocalTime showTime;

    private List<String>requestedSeats;
    private Integer showId;
    private Integer userId;
}
