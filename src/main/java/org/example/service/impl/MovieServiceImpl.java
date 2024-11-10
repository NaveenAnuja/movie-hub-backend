package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.Movie;
import org.example.entity.MovieEntity;
import org.example.repository.MovieRepository;
import org.example.service.MovieService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {

    private final ModelMapper mapper;
    private final MovieRepository movieRepository;

    @Override
    public void addMovie(Movie movie) {
        movieRepository.save(mapper.map(movie, MovieEntity.class));
    }

    @Override
    public List<Movie> getMovies() {
        List<Movie> movieList = new ArrayList<>();
        movieRepository.findAll().forEach(movieEntity -> {
            movieList.add(mapper.map(movieEntity,Movie.class));
        });
        return movieList;
    }

    @Override
    public void updateMovie(Movie movie) {
        movieRepository.save(mapper.map(movie,MovieEntity.class));
    }

    @Override
    public void deleteMovie(Integer id) {
        movieRepository.deleteById(id);
    }

    @Override
    public Movie searchMovieById(Integer id) {
        return mapper.map(movieRepository.findById(id),Movie.class);
    }

    @Override
    public List<Movie> searchMovieByName(String name) {
        List<MovieEntity> movieEntities = movieRepository.findByName(name);
        List<Movie> movies = new ArrayList<>();
        movieEntities.forEach(movieEntity -> movies.add(mapper.map(movieEntity, Movie.class)));
        return movies;
    }
}
