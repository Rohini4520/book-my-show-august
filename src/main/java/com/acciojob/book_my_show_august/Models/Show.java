package com.acciojob.book_my_show_august.Models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "shows")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private  Integer showId;

    private LocalDate showDate;

    private LocalTime showTime;

    @JoinColumn
    @ManyToOne
    private Movie movie;

    @JoinColumn
    @ManyToOne
    private Theater theater;

    @OneToMany(mappedBy = "show",cascade = CascadeType.ALL)
    private List<ShowSeat> showSeatList = new ArrayList<>();
}
