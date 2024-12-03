package dev.shilpa.coreJava.ComparatorVsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieComparator  {
    private int rating;
    private String movieName;
    private int releaseYear;

    public MovieComparator(){

    }
    public MovieComparator(int rating, String movieName, int releaseYear) {
        this.rating = rating;
        this.movieName = movieName;
        this.releaseYear = releaseYear;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public static void main(String[] args) {
        MovieComparator m1= new MovieComparator(5,"Avatar",2023);
        MovieComparator m2= new MovieComparator(4,"MI", 2014);
        MovieComparator m3 = new MovieComparator(4,"Moana", 2024);
        List<MovieComparator> movieList = new ArrayList<>();
        movieList.add(m1);
        movieList.add(m2);
        movieList.add(m3);
       // Create an object of ratingComparator
        RatingComparator ratingComparator = new RatingComparator();
        Collections.sort(movieList, ratingComparator);
        System.out.println("=======Sorting based on Rating=======");
        for (MovieComparator movie : movieList){
            System.out.println(movie.getMovieName()+", "+movie.getReleaseYear()+", "+ movie.getRating());
        }
        System.out.println();
        MovieNameComparator nameComparator = new MovieNameComparator();
        Collections.sort(movieList, nameComparator);
        System.out.println("=======Sorting based on Movie Name=======");
        for (MovieComparator movie : movieList){
            System.out.println(movie.getMovieName()+", "+movie.getReleaseYear()+", "+ movie.getRating());
        }
    }


}
