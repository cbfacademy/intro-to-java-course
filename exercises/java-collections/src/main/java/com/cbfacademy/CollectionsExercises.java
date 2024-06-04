package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // create an empty linked list
        LinkedList<Integer> newLinkedList = new LinkedList<Integer>();
        //  - add 4 as the first element of the list
        newLinkedList.addFirst(4);
        //  - then add 5, 6, 8, 2, 9 to the list
        newLinkedList.add(5);
        newLinkedList.add(6);
        newLinkedList.add(8);
        newLinkedList.add(2);
        newLinkedList.add(9);


        //  - add another 2 as the last element of the list
        newLinkedList.addLast(2);

        //  - add 4 as the 3rd element of the list
        newLinkedList.add(2, 4);

        //  - invoke the method element() on the list and print the result on the screen
        System.out.println(newLinkedList.element());
        //  - return the list
        return newLinkedList;
    }

    public Stack<Integer> useStack() {
        // create an empty stack
        Stack<Integer> newStack = new Stack<Integer>();
        //  - add 5, 6, 8, 9 to the stack
        newStack.add(5);
        newStack.add(6);
        newStack.add(8);
        newStack.add(9);
        //  - print the first element of the stack on the screen
        System.out.print(newStack.firstElement());
        //  - print the last element of the stack on the screen
        System.out.print(newStack.lastElement());
        //  - invoke the method pop() on the stack and print the result on the screen
        System.out.print(newStack.pop());

        //  - invoke the push(4) method on the stack
        newStack.push(4);
        //  - return the stack
        return newStack;
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // create an empty arrayQueue
        ArrayDeque<Integer> newQueue = new ArrayDeque<>();
        //  - add 5, 6, 8, 9 to the queue
        newQueue.add(5);
        newQueue.add(6);
        newQueue.add(8);
        newQueue.add(9);
        //  - print the first element of the queue on the screen
        System.out.print(newQueue.element());
        //  - print the last element of the queue on the screen
        System.out.print(newQueue.getLast());
        //  - invoke the method poll() on the queue and print the result on the screen
        System.out.print(newQueue.poll());
        //  - invoke the element() method on the queue and print the result on the screen
        System.out.print(newQueue.element());
        //  - return the queue
        return newQueue;
    }

    public HashMap<Integer, String> useHashMap() {
        //  create an empty hash map
        HashMap<Integer, String> countries = new HashMap<>();

        //  - add {1, TypeScript} entry to the map
        countries.put(1, "TypeScript");

        //  - add {2, Kotlin} entry to the map
        countries.put(2, "Kotlin");

        //  - add {3, Python} entry to the map
        countries.put(3, "Python");

        //  - add {4, Java} entry to the map
        countries.put(4, "Java");

        //  - add {5, JavaScript} entry to the map
        countries.put(5, "JavaScript");

        //  - add {6, Rust} entry to the map
        countries.put(6, "Rust");

        //  - determine the set of keys from the map and print it on the screen
        System.out.print(countries.keySet());

        //  - determine the set of values from the map and print it on the screen
        System.out.print(countries.values());

        //  - determine whether the map contains "English" as a language and print the result on the screen
        System.out.print(countries.containsValue("English"));
        //  - return the map
        return countries;
    }

    public String getName() {
        return "Collections Exercises";
    }
}
