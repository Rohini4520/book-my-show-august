package com.acciojob.book_my_show_august.Service;

import com.acciojob.book_my_show_august.Models.*;
import com.acciojob.book_my_show_august.Repositories.MovieRepository;
import com.acciojob.book_my_show_august.Repositories.ShowRepository;
import com.acciojob.book_my_show_august.Repositories.ShowSeatRepository;
import com.acciojob.book_my_show_august.Repositories.TheaterRepository;
import com.acciojob.book_my_show_august.Requests.AddShowRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShowService {

    @Autowired
    private ShowRepository showRepository;

     @Autowired
     private MovieRepository movieRepository;

     @Autowired
     private TheaterRepository theaterRepository;

     @Autowired
     private ShowSeatRepository showSeatRepository;

    public String addShow(AddShowRequest showRequest){


        Movie movie = movieRepository.findMovieByMovieName(showRequest.getMovieName());
        Theater theater = theaterRepository.findById(showRequest.getTheaterId()).get();

        //Add validations on if movie and theater are valid scenarios
            Show show = Show.builder().showDate(showRequest.getShowDate())
                    .showTime(showRequest.getShowTime())
                    .movie(movie)
                    .theater(theater)
                    .build();
            show = showRepository.save(show);


            //Associate the corresponding show Seats along with it
            List<TheaterSeat> theaterSeatList = theater.getTheaterSeatList();

            List<ShowSeat> showSeatList = new ArrayList<>();

            for(TheaterSeat theaterSeat : theaterSeatList) {

                ShowSeat showSeat = ShowSeat.builder().seatNo(theaterSeat.getSeatNo())
                        .seatType(theaterSeat.getSeatType())
                        .isBooked(Boolean.FALSE)
                        .isFoodAttached(Boolean.FALSE)
                        .show(show)
                        .build();
                showSeatList.add(showSeat);
            }
        //setting the bidirectional mapping attribute
        show.setShowSeatList(showSeatList);

            showSeatRepository.saveAll(showSeatList);
            return "The show has been saved to the DB with showId "+show.getShowId();
        }

    }