package org.example.service;

import org.example.dto.Movie;

import java.util.List;

public interface MovieService {
    void addMovie(Movie movie);

    List<Movie> getMovies();

    void updateMovie(Movie movie);

    void deleteMovie(Integer id);

    Movie searchMovieById(Integer id);

    List<Movie> searchMovieByName(String name);
}
