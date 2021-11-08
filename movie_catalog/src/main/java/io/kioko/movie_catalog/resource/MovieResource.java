package io.kioko.movie_catalog.resource;

import io.kioko.movie_catalog.model.Catalogue;
import io.kioko.movie_catalog.model.Movie;
import io.kioko.movie_catalog.model.Rating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author kioko
 */

@RestController
@RequestMapping("/api")
public class MovieResource {

    private final RestTemplate restTemplate;

    private final WebClient.Builder webClientBuilder;

    public MovieResource(RestTemplate restTemplate, WebClient.Builder webClientBuilder) {
        this.restTemplate = restTemplate;
        this.webClientBuilder = webClientBuilder;
    }

    @GetMapping("/{userId}")
    public List<Catalogue> getCatalogueByUserId (@PathVariable("userId") String userId) {


        List<Rating> ratings = Arrays.asList(
                new Rating("765", 3),
                new Rating("123", 4)
        );
        return ratings.stream().map(rating -> {
                Movie movie = restTemplate.getForObject("http://localhost:8001/movie/" + rating.getMovieId(), Movie.class);

                    /*Movie movie = webClientBuilder.build()
                           .get()
                           .uri("http://localhost:8001/movie/" + rating.getMovieId())
                           .retrieve()
                           .bodyToMono(Movie.class)
                           .block();*/

                    return new Catalogue(movie.getMovieName(), "Action", rating.getRating());
        })
                .collect(Collectors.toList());


        // get all rated movie IDs

        // for each movie Id call MovieInfo and get details

        // put them all together

    }
}
