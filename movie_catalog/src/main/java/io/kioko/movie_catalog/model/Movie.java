package io.kioko.movie_catalog.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author kioko
 */

@Setter
@Getter
public class Movie {

    private String movieId;
    private String movieName;

    public Movie() {
    }

    public Movie(String movieId, String movieName) {
        this.movieId = movieId;
        this.movieName = movieName;
    }
}
