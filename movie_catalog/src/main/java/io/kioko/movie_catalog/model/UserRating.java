package io.kioko.movie_catalog.model;

import java.util.List;

/**
 * @author kioko
 */

public class UserRating {

    private List<Rating> userRatings;

    public List<Rating> getUserRatings() {
        return userRatings;
    }

    public void setUserRatings(List<Rating> userRatings) {
        this.userRatings = userRatings;
    }
}
