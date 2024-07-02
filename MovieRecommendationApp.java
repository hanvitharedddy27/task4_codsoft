import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Movie {
    String title;
    String genre;

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }
}

class MovieRecommendationSystem {
    List<Movie> movies;

    public MovieRecommendationSystem() {
        this.movies = new ArrayList<>();
    }

    public void addMovie(String title, String genre) {
        Movie movie = new Movie(title, genre);
        this.movies.add(movie);
    }

    public List<Movie> recommendMovies(String userGenrePreference) {
        List<Movie> recommendedMovies = new ArrayList<>();

        for (Movie movie : this.movies) {
            if (movie.genre.equalsIgnoreCase(userGenrePreference)) {
                recommendedMovies.add(movie);
            }
        }

        return recommendedMovies;
    }
}

public class MovieRecommendationApp {
    public static void main(String[] args) {
        MovieRecommendationSystem recommendationSystem = new MovieRecommendationSystem();

        
        recommendationSystem.addMovie("The Adventure of Tintin", "Adventure");
        recommendationSystem.addMovie("Avatar:The Way of Water", "Adventure");
        recommendationSystem.addMovie("Indiana Jones and the Raiders of the Lost Ark", "Adventure");
        recommendationSystem.addMovie("Gladiator", "Adventure");
        recommendationSystem.addMovie("Back To The Future", "Adventure");
        recommendationSystem.addMovie("Interstellar", "Adventure");
        recommendationSystem.addMovie("The Journey To The Center Of The Earth", "Adventure");

        recommendationSystem.addMovie("Game Night", "Comedy");
        recommendationSystem.addMovie("Free Guy", "Comedy");
        recommendationSystem.addMovie("The Mask", "Comedy");
        recommendationSystem.addMovie("Ghostbusters", "Comedy");
        recommendationSystem.addMovie("Booksmart", "Comedy");
        recommendationSystem.addMovie("Vacation Friends", "Comedy");
        recommendationSystem.addMovie("Spy", "Comedy");
        recommendationSystem.addMovie("The French Dispatch", "Comedy");

       
        recommendationSystem.addMovie("IT", "Horror");
        recommendationSystem.addMovie("The Conjuring", "Horror");
        recommendationSystem.addMovie("Evil Dead Rise", "Horror");
        recommendationSystem.addMovie("Annabelle", "Horror");
        recommendationSystem.addMovie("The Pope's Exorcist", "Horror");
        recommendationSystem.addMovie("Insidious", "Horror");
        recommendationSystem.addMovie("American Mummy", "Horror");
        recommendationSystem.addMovie("The Nun", "Horror");

         recommendationSystem.addMovie("Dune", "Drama");
        recommendationSystem.addMovie("Oppenheimer", "Drama");
        recommendationSystem.addMovie("The Power of the Dog", "Drama");
        recommendationSystem.addMovie("CODA", "Drama");
        recommendationSystem.addMovie("Belfast", "Drama");
        recommendationSystem.addMovie("The Lost Daughter", "Drama");
        recommendationSystem.addMovie("Spencer", "Drama");
        recommendationSystem.addMovie("Dunkirk", "Drama");


        recommendationSystem.addMovie("Arrival", "sci-Fiction");
        recommendationSystem.addMovie("The Matrix", "sci-Fiction");
        recommendationSystem.addMovie("The Creator", "sci-Fiction");
        recommendationSystem.addMovie("Inception", "sci-Fiction");
        recommendationSystem.addMovie("2001:A Space Odyssey", "sci-Fiction");
        recommendationSystem.addMovie("Rebel Moon", "sci-Fiction");
        recommendationSystem.addMovie("Terminator-2", "sci-Fiction");
        recommendationSystem.addMovie("The Extra Terrestial", "sci-Fiction");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your genre preference (Adventure, Horror, Comedy, Drama, or sci-Fiction): ");
        String userPreference = scanner.nextLine();

        List<Movie> recommendedMovies = recommendationSystem.recommendMovies(userPreference);

        if (!recommendedMovies.isEmpty()) {
            System.out.println("Recommended Movies for " + userPreference + " lovers:");
            for (Movie movie : recommendedMovies) {
                System.out.println(movie.title);
            }
        } else {
            System.out.println("No " + userPreference + " movies found in the database.");
        }
        scanner.close();
    }
}

