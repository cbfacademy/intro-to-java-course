package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {

        //// TsODO: create an empty linked list
        LinkedList<Integer> integers = new LinkedList<Integer>();

        //  - add 4 as the first element of the list
        integers.addFirst(4);
        //  - then add 5, 6, 8, 2, 9 to the list
        // integers.addAll(5, 6, 8, 2, 9); // this doesnt work because you have to put these in a list first and then add it to the collection 
        List<Integer> miltipleIntegers = Arrays.asList(5, 6, 8, 2, 9); // creates a list interface
        integers.addAll(miltipleIntegers); // ads the list interface to the linkedinlist

        //  - add another 2 as the last element of the list
        integers.addLast(2);
        //  - add 4 as the 3rd element of the list
        integers.add(2,4);

        //  - invoke the method element() on the list and print the result on the screen
        System.out.println(integers.element());;

        //  - return the list
        return integers;
        // throw new RuntimeException("Not implemented");
        // hafsaelmi@Hafsas-MacBook-Air ~/Desktop/ETT/intro-to-java-course/exercises/java-collections/src/main/java -  (new_features) $ javac com/cbfacademy/CollectionsExercises.java

    }

    public Stack<Integer> useStack() {
        // TOsDO: create an empty stack
        Stack<Integer> stacks = new Stack<>();
    
        //  - add 5, 6, 8, 9 to the stack
        stacks.push(5);
        stacks.push(6);

        stacks.push(8);
        stacks.push(9);

        // List<Integer> mIntegers = Arrays.asList(5, 6, 8, 9);
        // // stacks.addAll(mIntegers); // doesn't work 
        // mIntegers.forEach(stacks::push);

        //  - print the first element of the stack on the screen
        System.out.print(stacks.firstElement());
        //  - print the last element of the stack on the screen
        System.out.print(stacks.lastElement());
        //  - invoke the method pop() on the stack and print the result on the screen
        System.out.print(stacks.pop());;
        //  - invoke the push(4) method on the stack
        stacks.push(4);
        //  - return the stack
        return stacks;
        // throw new RuntimeException("Not implemented");
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TOsDO: create an empty arrayDeque
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        //  - add 5, 6, 8, 9 to the queue
        arrayDeque.add(5);
        arrayDeque.add(6);
        arrayDeque.add(8);
        arrayDeque.add(9);
        //  - print the first element of the queue on the screen
        System.out.print(arrayDeque.peek());
        //  - print the last element of the queue on the screen
        System.out.print(arrayDeque.peekLast());

        //  - invoke the method poll() on the queue and print the result on the screen
        System.out.print(arrayDeque.poll());
        //  - invoke the element() method on the queue and print the result on the screen
        System.out.print(arrayDeque.element());

        //  - return the queue
        return arrayDeque;
        // throw new RuntimeException("Not implemented");
    }

    public HashMap<Integer, String> useHashMap() {
        // TOsDO: create an empty hash map
        Map<Integer, String> newHashMap = new HashMap<>();
        //  - add {1, TypeScript} entry to the map
        newHashMap.put(1, "TypeScript");
        //  - add {2, Kotlin} entry to the map
        newHashMap.put(2, "Kotlin");
        //  - add {3, Python} entry to the map
        newHashMap.put(3, "Python");
        //  - add {4, Java} entry to the map
        newHashMap.put(4, "Java");
        //  - add {5, JavaScript} entry to the map
        newHashMap.put(5, "JavaScript");
        //  - add {6, Rust} entry to the map
        newHashMap.put(6, "Rust");

        //  - determine the set of keys from the map and print it on the screen
        System.out.print(newHashMap.keySet());
        //  - determine the set of values from the map and print it on the screen
        System.out.print(newHashMap.values());

        //  - determine whether the map contains "English" as a language and print the result on the screen
        System.out.print(newHashMap.containsValue("English"));

        //  - return the map
        return (HashMap<Integer, String>) newHashMap;
        // throw new RuntimeException("Not implemented");

    }

    public String getName() {
        return "Collections Exercises";
    }
}