package dev.shilpa.coreJava.ComparatorVsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Movie implements Comparable<Movie> {
    private int rating;
    private String movieName;
    private int releaseYear;

    public Movie(){

    }
    public Movie(int rating, String movieName, int releaseYear) {
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

        Movie m1= new Movie(5,"Avatar",2023);
        Movie m2= new Movie(4,"MI", 2014);
        Movie m3 = new Movie(4,"Moana", 2024);
        List<Movie> movieList = new ArrayList<>();
        movieList.add(m1);
        movieList.add(m2);
        movieList.add(m3);
        Collections.sort(movieList);
        for (Movie movie : movieList){
            System.out.println(movie.getMovieName()+", "+movie.getReleaseYear());
        }
    }

    @Override
    public int compareTo(Movie o) {
       return this.releaseYear-o.getReleaseYear();
    }
}
