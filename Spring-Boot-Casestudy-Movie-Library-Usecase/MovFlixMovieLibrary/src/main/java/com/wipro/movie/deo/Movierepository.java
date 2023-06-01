package com.wipro.movie.deo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.wipro.movie.model.Movie;



public interface Movierepository extends JpaRepository<Movie, String> {

	@Query("SELECT m FROM Movie m")
	 List<Movie> getAllMovies();

}
