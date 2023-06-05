package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        //  - add 4 as the first element of the list
        //  - then add 5, 6, 8, 2, 9 to the the list
        //  - add another 2 as the last element of the list
        //  - add 4 as the 3rd element of the list
        //  - invoke the method element() on the list and print the result on the screen
        //  - return the list

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.addFirst(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(8);
        linkedList.add(2);
        linkedList.add(9);
        linkedList.addLast(2);
        linkedList.add(2, 4);

        System.out.println(linkedList.element());

        return linkedList;
    }

    public Stack<Integer> useStack() {
        // TODO: create an empty stack
        //  - add 5, 6, 8, 9 to the the stack
        //  - print the first element of the stack on the screen
        //  - print the last element of the stack on the screen
        //  - invoke the method pop() on the stack and print the result on the screen
        //  - invoke the push(4) method on the stack
        //  - return the stack

        Stack<Integer> stackOfIntegers = new Stack<Integer>();
        stackOfIntegers.push(5);
        stackOfIntegers.push(6);
        stackOfIntegers.push(8);
        stackOfIntegers.push(9);
        System.out.print(stackOfIntegers.firstElement());
        System.out.print(stackOfIntegers.lastElement());
        System.out.print(stackOfIntegers.pop());
        stackOfIntegers.push(4);

        return stackOfIntegers;
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        //  - add 5, 6, 8, 9 to the the stack
        //  - print the first element of the queue on the screen
        //  - print the last element of the queue on the screen
        //  - invoke the method poll() on the queue and print the result on the screen
        //  - invoke the element() method on the queue and print the result on the screen
        //  - return the queue

        ArrayDeque<Integer> listOfNumbers = new ArrayDeque<>();
        listOfNumbers.add(5);
        listOfNumbers.add(6);
        listOfNumbers.add(8);
        listOfNumbers.add(9);

        System.out.print(listOfNumbers.getFirst());
        System.out.print(listOfNumbers.getLast());
        System.out.print(listOfNumbers.poll());
        System.out.print(listOfNumbers.element());

        return listOfNumbers;
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
        //  - determine the set of keys from the map and print it on the screen
        //  - determine whether the map contains "English" as a language and print the result on the screen
        //  - return the map
        HashMap<Integer, String> programmingLanguages = new HashMap<Integer, String>(){{
            put(1, "TypeScript");
            put(2, "Kotlin");
            put(3, "Python");
            put(4, "Java");
            put(5,"JavaScript");
            put(6, "Rust");
        }};
        System.out.print(programmingLanguages.keySet());
        System.out.print(programmingLanguages.values());
        System.out.print(programmingLanguages.containsValue("English"));
        return programmingLanguages;
    }

    public String getName() {
        return "Collections Exercises";
    }

    public static void main(String[] arr) {
        CollectionsExercises numberLinkedList = new CollectionsExercises();
        numberLinkedList.useLinkedList();

        CollectionsExercises stackList = new CollectionsExercises();
        stackList.useStack();

        CollectionsExercises numberList = new CollectionsExercises();
        numberList.useArrayDeque();

        CollectionsExercises codingLanaguges = new CollectionsExercises();
        codingLanaguges.useHashMap();
    }
}
