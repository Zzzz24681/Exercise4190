package test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sorting {
    
    public List<Integer> sortIntegers(List<Integer> intList) {
        List<Integer> sortedList = new ArrayList<>(intList);
        Collections.sort(sortedList);
        return sortedList;
    }
    
    public List<String> sortStrings(List<String> strList) {
        List<String> sortedList = new ArrayList<>(strList);
        Collections.sort(sortedList);
        return sortedList;
    }

    public static void main(String[] args) {
    	sorting sortable = new sorting();
        
        
        List<Integer> integers = List.of(34, 1, 23, 87, 3, 45);
        List<Integer> sortedIntegers = sortable.sortIntegers(integers);
        System.out.println("Sorted Integers: " + sortedIntegers);
        
        // Sorting strings
        List<String> strings = List.of("banana", "apple", "cherry", "date");
        List<String> sortedStrings = sortable.sortStrings(strings);
        System.out.println("Sorted Strings: " + sortedStrings);
    }
}
