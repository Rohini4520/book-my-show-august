package com.acciojob.book_my_show_august.Requests;

import com.acciojob.book_my_show_august.Enums.Language;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AddMovieRequest {

    private String movieName;
    private Double duration;
    private LocalDate releaseDate;
    private Language language;
    private Double rating;
}
