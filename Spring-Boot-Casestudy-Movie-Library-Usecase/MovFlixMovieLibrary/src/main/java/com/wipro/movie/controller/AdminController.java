package com.wipro.movie.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import com.wipro.movie.deo.Movierepository;
import com.wipro.movie.model.Movie;
import com.wipro.movie.services.MovieServiceImp;

@Controller
public class AdminController {
    @Autowired
    Movierepository repo;
    @GetMapping("/")
    public String showLoginPage() {
        return "login";
    }
    
    @PostMapping("/admin/login")
    public String login(@RequestParam String userId, @RequestParam String password, Model model) {
        
        if (userId.equals("stella@gmail.com") && password.equals("stellar")) {
            return "admin-page";
        } else {
            model.addAttribute("error", "Invalid credentials");
            return "login";
        }
    }
    
    @GetMapping("/admin/add-movie")
    public String showAddMoviePage() {
        return "add-movie";
    }
    @PostMapping("/admin/add-movie")
    public String saving(Movie movie)
    {
    	repo.save(movie);
    	 return "confirmation";
    }
 
    @GetMapping("/getemployee")
    public String displayEmployeeById(@RequestParam String id, Model model) {
        Optional<Movie> employee = repo.findById(id);
        if (employee.isPresent()) {
            model.addAttribute("employee", employee.get());
        } else {
            // Handle the case when employee is not found
            model.addAttribute("employee", null);
        }
        return "getemployee";
    }
    @Autowired
    MovieServiceImp msi;
    @RequestMapping("/byname")
    public String searchByMovieName(@RequestParam("name") String name, Model model) {
List<Movie> matchingMovies = msi.searchByMovieName(name);
model.addAttribute("matchingMovies", matchingMovies);
return "search";
}

    @RequestMapping("/bycollection")

    public String searchByCollection(@RequestParam("minCollection") int minCollection, @RequestParam("maxCollection") int maxCollection,Model model) {

    List<Movie> movies = msi.getMoviesByCollectionRange(minCollection, maxCollection);

    if (!movies.isEmpty()) {

    model.addAttribute("movies", movies);

    return "getSearch";

    } else {

    return "error";

    }

    }
    @GetMapping("/admin/modify-movie")
    public String showModifyMoviePage() {
        return "modify-movie";
    }
}
