package com.example.movie_rating.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author kioko
 */

@Setter
@Getter
public class Rating {

    private String movieId;
    private int rating;

    public Rating(String movieId, int rating) {
        this.movieId = movieId;
        this.rating = rating;
    }
}
