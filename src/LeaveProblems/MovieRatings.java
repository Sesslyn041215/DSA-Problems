package LeaveProblems;

import java.util.*;
import java.util.regex.*;

//Mayajaal Cinemas is seeking a program for their Movie Review system. Movie enthusiasts can submit their reviews and ratings. Mayajaal wants to analyze these reviews to determine whether a movie is a hit or a flop based on user ratings.
//Example:
//3
//Leo | Action | 3.5/5 | "1st half good. 2nd half lags"
//Leo | Action | 4.5/5 | "Excellent movie"
//Leo | Action | 2.5/5 | "One-time watchable"
//Overall Summary:
//For the movie "Leo," the average rating is 3.5/5, indicating it is a hit.

public class MovieRatings {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<Double>> movieRatings = new HashMap<>();
        Map<String, String> movieGenres = new HashMap<>();

        int n = Integer.parseInt(sc.nextLine());

        while (n-- > 0) {
            String input = sc.nextLine();
            String[] parts = input.split("\\|");
            
            if (parts.length >= 3) {
                String movieName = parts[0].trim();
                String genre = parts[1].trim();
                Double rating = extractRating(parts[2].trim());
                
                if (rating != null) {
                    String movieKey = movieName + " - " + genre;
                    
                    if (!movieRatings.containsKey(movieKey)) {
                        movieRatings.put(movieKey, new ArrayList<>());
                        movieGenres.put(movieKey, genre);
                    }
                    
                    movieRatings.get(movieKey).add(rating);
                }
            }
        }
        
        for (Map.Entry<String, List<Double> > entry : movieRatings.entrySet()) {
            String movieKey = entry.getKey();
            String genre = movieGenres.get(movieKey);
            List<Double> ratings = entry.getValue();
            
            double averageRating = calculateAverageRating(ratings);
            String result = analyzeRating(averageRating);
            
            System.out.println("The movie " + movieKey + " is " + result);
        }
    }

    private static Double extractRating(String ratingText) {
        Pattern pattern = Pattern.compile("(\\d+\\.?\\d*)/5");
        Matcher matcher = pattern.matcher(ratingText);
        if (matcher.find()) {
            return Double.parseDouble(matcher.group(1));
        }
        return null;
    }

    private static double calculateAverageRating(List<Double> ratings) {
        double sum = 0.0;
        for (Double rating : ratings) {
            sum += rating;
        }
        return sum / ratings.size();
    }

    private static String analyzeRating(double averageRating) {
    	 if (averageRating >= 3.5) {
             return "hit";
         } else if (averageRating < 3.0) {
             return "flop";
         } else {
             return "neither hit nor flop";
         }
    }
    
}
