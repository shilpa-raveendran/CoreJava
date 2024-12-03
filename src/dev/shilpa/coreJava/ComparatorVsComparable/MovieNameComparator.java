package dev.shilpa.coreJava.ComparatorVsComparable;

import java.util.Comparator;

public class MovieNameComparator implements Comparator<MovieComparator> {
    @Override
    public int compare(MovieComparator o1, MovieComparator o2) {
        return o1.getMovieName().compareTo(o2.getMovieName());
    }
}
