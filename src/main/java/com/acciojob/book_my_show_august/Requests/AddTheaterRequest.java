package com.acciojob.book_my_show_august.Requests;

import lombok.Data;

@Data
public class AddTheaterRequest {
    private Integer noOfScreens;
    private String name;
    private String address;

}
