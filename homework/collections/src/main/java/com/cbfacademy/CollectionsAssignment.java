package com.cbfacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectionsAssignment {

    /**
     * This method removes all values from the provided list that are smaller
     * than the indicated integer. The remaining elements retain their original
     * ordering.
     *
     * @param list   - the list of integers
     * @param minValue the minimum value to retain
     */
    public static void removeSmallInts(List<Integer> list, int minValue) {
        // Your solution must traverse the list from last to first element
        // removing any values less than minValue.
     for(int i = list.size() -1; i >=0; i--){
        int val =list.get(i);
        if (val < minValue){
            list.remove(i);
        }
     }

        //ListIterator<Integer> result = list.listIterator(list.size());
        //while (result.hasPrevious()) {
           // int current = result.previous();
           // if (current < minValue)
            //{
              //  result.remove();
           // }
       // }
    }

    /**
     * This method returns true if the provided collection contains any
     * duplicate elements.
     *
     * @param integers - a collection of integers
     * @return true if integers contains duplicates, false otherwise
     */
    public static boolean containsDuplicates(Collection<Integer> integers) {
        // Your solution must not use any loops.


        Set<Integer> uniqueNumbers = new HashSet<>(integers);
        boolean hasDuplicates = uniqueNumbers.size() < integers.size();
        return hasDuplicates;
      
    }


    /**
     * This method returns an ArrayList containing all elements that appear in
     * either of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order.
     * <p>
     * For example, if the two arguments contain {2, 1, 2, 3} and {3, 4, 4, 5},
     * the returned ArrayList will contain {1, 2, 3, 4, 5}. The original
     * collections will not be modified.
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return A sorted ArrayList containing the integers that appear in either
     * collection.
     */
    public static ArrayList<Integer> inEither(Collection<Integer> ints1, Collection<Integer> ints2) {
        // This must be done with no loops.
        
        // TreeSet automatically sorts the argument
            Set<Integer> set = new TreeSet<>(ints1);

            // skips duplicate as per Set implementation
            set.addAll(ints2);
        
        return new ArrayList<>(set);
    } 


    /**
     * This method returns an ArrayList containing all elements that appear in
     * both of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order. For example, if the two arguments contain {2, 1, 2, 3} and
     * {3, 4, 4, 5}, the returned ArrayList will contain {3}. The original
     * collections will not be modified.
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return An ArrayList containing the integers that appear in both
     * collections.
     */
    public static ArrayList<Integer> inBoth(Collection<Integer> ints1, Collection<Integer> ints2) {
        // This must be done with no loops.

            // created two HashSet objects (set1 and set2) from the input collections
            Set<Integer> set1 = new HashSet<>(ints1);
            Set<Integer> set2 = new HashSet<>(ints2);
    
            // Find the intersection of the two sets
            set1.retainAll(set2);
    
            return new ArrayList<>(set1);
    }

    /**
     * This method returns the String that appears most frequently in the
     * provided list. For example, if the input list contains the elements
     * {"Bob", "Alice", "Bob"}, this method will return "Bob". If there are
     * ties, any of the most frequently occurring elements may be returned.
     * If the list is empty, return the empty string "".
     *
     * @param list - a list of Strings
     * @return the most frequently occurring String
     */
    public static String mostFrequent(List<String> list) {
        // You should solve this problem in two stages: First iterate through
        // the list to count occurrences of each String. Then iterate through
        // your counts to find the largest. You'll need a collection that allows
        // you to store a mapping from Strings to counts.
        // No nested loops or non-enhanced for-loops are allowed.

        //iterate through the list to count occurrences of each String
        // Count occurrences using streams

        Map<String, Long> occurrences = list.stream()
        .collect(Collectors.groupingBy(s -> s, Collectors.counting()));


       // Then iterate through your counts to find the largest

       Optional<Map.Entry<String, Long>> maxEntry = occurrences.entrySet().stream()
                .max(Map.Entry.comparingByValue());


        // If there is a max entry, return its key; otherwise, return an empty string

        return maxEntry.map(Map.Entry::getKey).orElse("");        
        
    }

    public static String getName() {
        return "Collections Assignment";
    }
}
