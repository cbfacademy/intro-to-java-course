package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        //  - add 4 as the first element of the list
        //  - then add 5, 6, 8, 2, 9 to the list
        //  - add another 2 as the last element of the list
        //  - add 4 as the 3rd element of the list
        //  - invoke the method element() on the list and print the result on the screen
        //  - return the list
        // throw new RuntimeException("Not implemented");

            LinkedList<Integer> linkedList = new LinkedList<>();
    
             // Add elements to the list
            linkedList.addFirst(4);
            linkedList.add(5);
            linkedList.add(6);
            linkedList.add(8);
            linkedList.add(2);
            linkedList.add(9);
            linkedList.addLast(2);
            linkedList.add(2, 4);

             // Invoke the method element() on the list and print the result on the screen
             Integer result = linkedList.element();
             System.out.print(result);

            // Return the list
            return linkedList; 
    }

    public Stack<Integer> useStack() {
        // TODO: create an empty stack
        //  - add 5, 6, 8, 9 to the stack
        //  - print the first element of the stack on the screen
        //  - print the last element of the stack on the screen
        //  - invoke the method pop() on the stack and print the result on the screen
        //  - invoke the push(4) method on the stack
        //  - return the stack
        // throw new RuntimeException("Not implemented");
        
        // a stack
        Stack<Integer> stack = new Stack<>();

        // Add 5, 6, 8, 9 to the stack
        stack.push(5);
        stack.push(6);
        stack.push(8);
        stack.push(9);

        // Print the first element of the stack on the screen
        System.out.print(stack.firstElement());

        // Print the last element of the stack on the screen
        System.out.print(stack.lastElement());

        // Invoke the method pop() on the stack and print the result on the screen
        System.out.print(stack.pop());

        // Invoke the push(4) method on the stack
        stack.push(4);

        // Return the stack
        return stack;
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        //  - add 5, 6, 8, 9 to the queue
        //  - print the first element of the queue on the screen
        //  - print the last element of the queue on the screen
        //  - invoke the method poll() on the queue and print the result on the screen
        //  - invoke the element() method on the queue and print the result on the screen
        //  - return the queue
        // throw new RuntimeException("Not implemented");

        // an empty ArrayDeque
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        // Add 5, 6, 8, 9 to the queue
        arrayDeque.add(5);
        arrayDeque.add(6);
        arrayDeque.add(8);
        arrayDeque.add(9);

        // Print the first element of the queue on the screen
        System.out.print(arrayDeque.peekFirst());

        // Print the last element of the queue on the screen
        System.out.print(arrayDeque.peekLast());

        // Invoke the method poll() on the queue and print the result on the screen
        System.out.print(arrayDeque.poll());

        // Invoke the element() method on the queue and print the result on the screen
        System.out.print(arrayDeque.element());

        // Return the queue
        return arrayDeque;
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
        // throw new RuntimeException("Not implemented");

        // an empty HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Add entries to the map
        hashMap.put(1, "TypeScript");
        hashMap.put(2, "Kotlin");
        hashMap.put(3, "Python");
        hashMap.put(4, "Java");
        hashMap.put(5, "JavaScript");
        hashMap.put(6, "Rust");

        // Determine the set of keys and print it
        Set<Integer> keySet = hashMap.keySet();
        System.out.print(keySet);

        // Determine the set of values and print it
        Collection<String> values = hashMap.values();
        System.out.print(values);

        // Determine whether the map contains "English" as a language and print the result
        boolean containsEnglish = values.contains("English");
        System.out.print(containsEnglish);

        // Return the map
        return hashMap;
    }

    public String getName() {
        return "Collections Exercises";
    }
}
