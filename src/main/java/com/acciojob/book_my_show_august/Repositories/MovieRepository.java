package com.acciojob.book_my_show_august.Repositories;

import com.acciojob.book_my_show_august.Models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository  extends JpaRepository<Movie,Integer> {

    Movie findMovieByMovieName(String MovieName);
}
