package com.acciojob.book_my_show_august.Requests;

import lombok.Data;

@Data
public class AddTheaterSeatsRequest {

    private Integer theaterId;
    private Integer noOfClassicSeats;
    private Integer noOfPremiumSeats;

}
