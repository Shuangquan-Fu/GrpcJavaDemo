package com.quan.aggigate.controller;

import com.quan.aggigate.dto.RecommendedMovie;
import com.quan.aggigate.dto.UserGenre;
import com.quan.aggigate.service.UserMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RController {
    @Autowired
    private UserMovieService userMovieService;
    @GetMapping("/user/{loginId}")
    public List<RecommendedMovie> getMovies(@PathVariable String loginId) {
        return this.userMovieService.getUserMovieSuggestions(loginId);
    }
    @PutMapping("/user")
    public void setUserGenre(@RequestBody UserGenre userGenre) {
        this.userMovieService.setUserGenre(userGenre);
    }
}
