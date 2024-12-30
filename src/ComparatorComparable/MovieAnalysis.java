package ComparatorComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MovieAnalysis {
    public static void main(String [] args) {
        List<Movies> list = new ArrayList<>();
        list.add(new Movies("A", 9.0f, 2001));
        list.add(new Movies("B",8.0f,2008));
        list.add(new Movies("C",8.0f,2003));
        list.add(new Movies("D",7.0f,2008));
        Comparator<Movies> comparator=Comparator.comparing(Movies::getYear).thenComparing(Movies::getRating);
        list.sort(comparator);
        //Collections.sort(list,comparator);
        System.out.println(list);
    }
}
