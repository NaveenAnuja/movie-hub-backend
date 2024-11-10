package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Movie;
import org.example.service.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/movie")
@RequiredArgsConstructor
public class Movie_Controller {

    private final MovieService service;
    @PostMapping("/add-movie")
    public void addMovie(@RequestBody Movie movie){
        service.addMovie(movie);
    }

    @PutMapping("/update-movie")
    public void updateMovie(@RequestBody Movie movie){
        service.updateMovie(movie);
    }

    @GetMapping("/view-movies")
    public List<Movie> getMovies(){
        return service.getMovies();
    }

    @DeleteMapping("/delete-movie/{id}")
    public void deleteMovieById(@PathVariable Integer id){
        service.deleteMovie(id);
    }

    @GetMapping("/search-by-id/{id}")
    public Movie searchMovieById (@PathVariable Integer id){
        return service.searchMovieById(id);
    }

    @GetMapping("/search-by-name/{name}")
    public List<Movie> searchMovieByName(@PathVariable String name){
        return service.searchMovieByName(name);
    }
}
