package com.cbfacademy;

import java.util.*;
import java.util.List;
import java.util.Queue;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        List<Integer> integers = new LinkedList<>();
        System.out.println(integers.size());

        //  - add 4 as the first element of the list
        integers.add(4);

        //  - then add 5, 6, 8, 2, 9 to the list
        integers.add(5);
        integers.add(6);
        integers.add(8);
        integers.add(2);
        integers.add(9);

        //  - add another 2 as the last element of the list
        integers.addLast(2);

        //  - add 4 as the 3rd element of the list
        integers.add(2, 4);

        //  - invoke the method element() on the list and print the result on the screen
        Integer firstElement = ((Queue<Integer>) integers).element();
        System.out.println("First element retrieved by element(): " + firstElement);

        //  - return the list
        System.out.println(integers);
        // throw new RuntimeException("Not implemented");
    }

    public Stack<Integer> useStack() {
        // TODO: create an empty stack
        //  - add 5, 6, 8, 9 to the stack
        //  - print the first element of the stack on the screen
        //  - print the last element of the stack on the screen
        //  - invoke the method pop() on the stack and print the result on the screen
        //  - invoke the push(4) method on the stack
        //  - return the stack
        throw new RuntimeException("Not implemented");
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        //  - add 5, 6, 8, 9 to the queue
        //  - print the first element of the queue on the screen
        //  - print the last element of the queue on the screen
        //  - invoke the method poll() on the queue and print the result on the screen
        //  - invoke the element() method on the queue and print the result on the screen
        //  - return the queue
        throw new RuntimeException("Not implemented");
    }

    public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map
        //  - add {1, TypeScript} entry to the map
        //  - add {2, Kotlin} entry to the map
        //  - add {3, Python} entry to the map
        //  - add {4, Java} entry to the map
        //  - add {5, JavaScript} entry to the map
        //  - add {6, Rust} entry to the map
        //  - determine the set of keys from the map and print it on the screen
        //  - determine the set of values from the map and print it on the screen
        //  - determine whether the map contains "English" as a language and print the result on the screen
        //  - return the map
        throw new RuntimeException("Not implemented");
    }

    public String getName() {
        return "Collections Exercises";
    }
}
