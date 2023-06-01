package com.wipro.movie.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.movie.deo.Movierepository;
import com.wipro.movie.model.Movie;
@Service
public class MovieServiceImp implements MovieService{
	@Autowired 
	Movierepository repo;

	 private List<Movie> movies;

	    public void MovieService() {
	        movies = new ArrayList<>(); // Initialize the movies list
	    }
	    public List<Movie> getMoviesByCollectionRange(int minCollection, int maxCollection) {
	        List<Movie> result = new ArrayList<>();
	        for (Movie movie : retrieveAllMovies())
	        {
	        	if (movie.getCollection() >= minCollection && movie.getCollection() <= maxCollection)
	        	{
	                result.add(movie);
	            }
	        }
	        
	        return result;
	    }

		

	@Override
	public void addMovie(Movie movie) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Movie> searchByMovieName(String name) {
		List<Movie> allMovies = repo.getAllMovies();
		 List<Movie> matchingMovies = new ArrayList<>();

		 for (Movie movie : allMovies) {
		 if (movie.getName().toLowerCase().contains(name.toLowerCase())) {
		matchingMovies.add(movie);
		}
		}

	 return matchingMovies;
	}
	@Override
	public List<Movie> retrieveAllMovies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie getMovieById(String movieId) {
		// TODO Auto-generated method stub
		return null;
	}
	 
	
}
