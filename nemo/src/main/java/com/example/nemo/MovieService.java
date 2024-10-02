package com.example.nemo;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Moviesapp> getAllMovies() {
        return movieRepository.findAll();
    }

    public Optional<Moviesapp> getMovieById(Long id) {
        return movieRepository.findById(id);
    }

    public Moviesapp createMovie(Moviesapp movie) {
        return movieRepository.save(movie);
    }

    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }
}
