package com.acciojob.book_my_show_august.Models;


import com.acciojob.book_my_show_august.Enums.SeatType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "show_seats")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShowSeat {

    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private Integer showSeatId;

    private String seatNo;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    private Boolean isBooked;
    private Boolean isFoodAttached;

    @ManyToOne
    @JoinColumn(name = "show_id") // Matches the updated column
    private Show show;
}


