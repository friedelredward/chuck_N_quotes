package com.example.chuck_n_quotes.controllers;

import com.example.chuck_n_quotes.services.RandomJokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by r.edward on {08/08/2023}
 */
@Controller
public class RandomJokeController {
    RandomJokeService randomJokeService;

    public RandomJokeController(RandomJokeService randomJokeService) {
        this.randomJokeService = randomJokeService;
    }

    @RequestMapping("/")
    String getRandomJoke(Model model){
        model.addAttribute("thejoke", randomJokeService.getRandomJoke());
        return "random/index";
    }
}
