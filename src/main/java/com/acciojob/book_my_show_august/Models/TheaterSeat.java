package com.acciojob.book_my_show_august.Models;

import com.acciojob.book_my_show_august.Enums.SeatType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "theater_seats")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class TheaterSeat {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer theaterId;

    private  String SeatNo;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    @JoinColumn
    @ManyToOne
    private Theater theater;
}
