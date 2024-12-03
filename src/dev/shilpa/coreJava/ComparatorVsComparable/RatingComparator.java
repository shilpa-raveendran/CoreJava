package dev.shilpa.coreJava.ComparatorVsComparable;

import java.util.Comparator;

public class RatingComparator implements Comparator<MovieComparator> {
    @Override
    public int compare(MovieComparator o1, MovieComparator o2) {
        return o1.getRating()-o2.getRating();
    }
}
