package stream_api.trending_movies;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Movie movie1  = new Movie("Inception", 8.8, 2010);
        Movie movie2  = new Movie("Interstellar", 8.6, 2014);
        Movie movie3  = new Movie("The Dark Knight", 9.0, 2008);
        Movie movie4  = new Movie("Avengers: Endgame", 8.4, 2019);
        Movie movie5  = new Movie("Parasite", 8.6, 2019);
        Movie movie6  = new Movie("Joker", 8.4, 2019);
        Movie movie7  = new Movie("Titanic", 7.9, 1997);
        Movie movie8  = new Movie("Gladiator", 8.5, 2000);
        Movie movie9  = new Movie("Avatar", 7.9, 2009);
        Movie movie10 = new Movie("The Matrix", 8.7, 1999);
        Movie movie11 = new Movie("3 Idiots", 8.4, 2009);
        Movie movie12 = new Movie("Dangal", 8.3, 2016);
        Movie movie13 = new Movie("RRR", 7.8, 2022);
        Movie movie14 = new Movie("Baahubali: The Beginning", 8.0, 2015);
        Movie movie15 = new Movie("PK", 8.1, 2014);
        Movie movie16 = new Movie("Train to Busan", 7.6, 2016);
        Movie movie17 = new Movie("Oldboy", 8.4, 2003);
        Movie movie18 = new Movie("The Handmaiden", 8.1, 2016);
        Movie movie19 = new Movie("Memories of Murder", 8.1, 2003);
        Movie movie20 = new Movie("A Taxi Driver", 7.9, 2017);

        List<Movie> trendingMovies = Movie.movies.stream().filter(movie -> movie.rating > 8.0).sorted(
                      Comparator.comparing((Movie movie) -> movie.rating).reversed().thenComparing(
                      Comparator.comparing((Movie movie) -> movie.releaseYear).reversed())
                )
                .limit(5).toList();
        trendingMovies.forEach(System.out::println);
    }
}
