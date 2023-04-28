package com.Disheen.MoviesReview;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class MovieService {
    private static final Logger logger = LoggerFactory.getLogger(MovieService.class);
    @Autowired
    private  MovieRepository movieRepository;
//    @Autowired
//    private Movie movie;
    public List<Movie> allMovies(){
        return movieRepository.findAll();

    }

    public Optional<Movie> getMovie(String imdbId){
        Optional<Movie> resp=movieRepository.findByImdbId(imdbId);
        System.out.println(resp);

//        if (resp.isPresent()) {
//            List<String> genres = resp.get().getGenre();
//            // use genres here
//            System.out.println(genres);
//        }
        return movieRepository.findByImdbId(imdbId);

    }
}
