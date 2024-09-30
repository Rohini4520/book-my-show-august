package com.acciojob.book_my_show_august.Requests;

import com.acciojob.book_my_show_august.Enums.Language;
import lombok.Data;


@Data


public class UpdateMovieRequest {

    private String movieName;
    private Language newLanguage;
    private Double newRating;

}
