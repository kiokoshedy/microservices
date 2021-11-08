package io.kioko.movie_catalog.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author kioko
 */

@Getter
@Setter
public class Catalogue {

    private String name;
    private String desc;
    private int rating;

    public Catalogue() {
    }

    public Catalogue(String name, String desc, int rating) {
        this.name = name;
        this.desc = desc;
        this.rating = rating;
    }
}
