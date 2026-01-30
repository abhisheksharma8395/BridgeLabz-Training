package stream_api.trending_movies;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    static List<Movie> movies = new ArrayList<>();                      // Stores the list of movies
    String movieName;                                                  // Stores the movie name
    Double rating;                                                     // Stores the movie rating
    Integer releaseYear;                                                // Stores the release year of movie

    // Constructor of Movie class to initialize instance variable
    public Movie(String movieName,Double rating,Integer releaseYear){
        this.movieName = movieName;
        this.rating = rating;
        this.releaseYear = releaseYear;
        movies.add(this);
    }

    @Override
    public String toString(){
        return "Movie Name : "+this.movieName+" Rating : "+this.rating+" Release Year : "+this.releaseYear;
    }

}
