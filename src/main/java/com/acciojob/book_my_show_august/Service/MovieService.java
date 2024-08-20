package com.acciojob.book_my_show_august.Service;

import com.acciojob.book_my_show_august.Models.Movie;
import com.acciojob.book_my_show_august.Repositories.MovieRepository;
import com.acciojob.book_my_show_august.Requests.AddMovieRequest;
import com.acciojob.book_my_show_august.Requests.UpdateMovieRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    public MovieRepository movieRepository;

    public String addMovie(AddMovieRequest movieRequest) {

        //From my Request Entry I am creating the entity : bcz entity saves into the DB
        Movie movie = new Movie();
        movie.setMovieName(movieRequest.getMovieName());
        movie.setDuration(movieRequest.getDuration());
        movie.setLanguage(movieRequest.getLanguage());
        movie.setRating(movieRequest.getRating());
        movie.setReleaseDate(movieRequest.getReleaseDate());

        movie = movieRepository.save(movie);
        return "Movie has been added to the DB with movieId " + movie.getMovieId();
    }

    public String updateMovieAttributes(UpdateMovieRequest movieRequest) {

        //Get the movie Entity
        Movie movie = movieRepository.findMovieByMovieName(movieRequest.getMovieName());

        //Get value from hashmap

        //Update the new attributes
        movie.setLanguage(movieRequest.getNewLanguage());
        movie.setRating(movieRequest.getNewRating());

        //update the value

        // Save it back to DB
        movieRepository.save(movie);

        //put it back to HM
        return "Movie Attributes have been updated ";
    }
}
