package com.acciojob.book_my_show_august.Models;

import com.acciojob.book_my_show_august.Enums.Language;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Entity
@Table(name =  "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieId;

    @Column(unique = true)
    private String movieName;

    private Double duration;

    private LocalDate releaseDate;

    @Enumerated(value = EnumType.STRING)
    private Language language;

    private Double rating;

}
