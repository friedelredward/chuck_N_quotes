package com.example.chuck_n_quotes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by r.edward on {08/08/2023}
 */
@Service
public class ChuckNorrisRandomJokeServiceImpl implements RandomJokeService {

    @Override
    public String getRandomJoke() {
        return new ChuckNorrisQuotes().getRandomQuote();
    }
}
