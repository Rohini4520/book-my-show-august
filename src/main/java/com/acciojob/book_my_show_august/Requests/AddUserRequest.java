package com.acciojob.book_my_show_august.Requests;

import lombok.Data;

@Data
public class AddUserRequest {
    private String name;
    private Integer age;
    private String emailId;
    private String mobileNo;

}
