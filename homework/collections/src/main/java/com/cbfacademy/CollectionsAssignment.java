package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

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
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) < minValue) {
                list.remove(i);
            }
        }
    }
    
    

    /**
     * This method returns true if the provided collection contains any
     * duplicate elements.
     *
     * @param integers - a collection of integers
     * @return true if integers contains duplicates, false otherwise
     */
    public static boolean containsDuplicates(Collection<Integer> integers) {
        Set<Integer> set_verify = new HashSet<>(integers);
        if (set_verify.size() != integers.size()){
            return true;
        }
        return false;
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
        TreeSet<Integer> sorted_list = new TreeSet <> ();
        sorted_list.addAll(ints1);
        sorted_list.addAll(ints2);
        return new ArrayList<>(sorted_list);

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

        TreeSet<Integer> sortedlist2 = new TreeSet <> (ints1);
        sortedlist2.retainAll(ints2);
        sortedlist2.addAll(ints2);
        return new ArrayList<>(sortedlist2);
        
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
        HashMap<String, Integer> counts = new HashMap<>();
        for(String str : list) {
            counts.put(str, counts.getOrDefault(str, 0)+1);
        }
        String most_frequent = "";
        int count = 0;
        for (Map.Entry<String, Integer> entry: counts.entrySet()) {
            if (entry.getValue() > count) {
                count =entry.getValue();
                most_frequent = entry.getKey();

            }

        }



        return most_frequent;
    }

    public static String getName() {
        return "Collections Assignment";
    }
}
