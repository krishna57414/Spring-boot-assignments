package com.wipro.movie.services;

import java.util.List;

import com.wipro.movie.model.Movie;

public interface MovieService {
	
	List<Movie>getMoviesByCollectionRange(int minCollection, int maxCollection);

	void addMovie(Movie movie);
	List<Movie> searchByMovieName(String name);
	List<Movie> retrieveAllMovies();

	Movie getMovieById(String movieId);

}
