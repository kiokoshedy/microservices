package io.kioko.movie_catalog.resource;

import io.kioko.movie_catalog.model.Catalogue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * @author kioko
 */

@RestController
@RequestMapping("/api")
public class MovieResource {

    @GetMapping("/{userId}")
    public List<Catalogue> getCatalogueByUserId (@PathVariable("userId") String userId) {

        return Collections.singletonList(
                new Catalogue("BatMan", "Action", 3)
        );
    }
}
