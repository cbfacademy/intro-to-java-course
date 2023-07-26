package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        LinkedList<Integer> newLinkedList = new LinkedList<Integer>();

        //  - add 4 as the first element of the list
        newLinkedList.add(4);
        //  - then add 5, 6, 8, 2, 9 to the list
        newLinkedList.add(5);
        newLinkedList.add(6);
        newLinkedList.add(8);
        newLinkedList.add(2);
        newLinkedList.add(9);
        //  - add another 2 as the last element of the list
        newLinkedList.add(2);
        //  - add 4 as the 3rd element of the list
        newLinkedList.add(2, 4);
        //  - invoke the method element() on the list and print the result on the screen
        System.out.println(newLinkedList.element());
        //  - return the list
        return newLinkedList;
    }

    public Stack<Integer> useStack() {
        Stack<Integer> stack = new Stack<>();

        //  - add 5, 6, 8, 9 to the stack
        stack.add(5);
        stack.add(6);
        stack.add(8);
        stack.add(9);
        //  - print the first element of the stack on the screen
        System.out.print(stack.firstElement());
        //  - print the last element of the stack on the screen
        System.out.print(stack.lastElement());
        //  - invoke the method pop() on the stack and print the result on the screen
        System.out.print(stack.pop());
        //  - invoke the push(4) method on the stack
        stack.push(4);
        //  - return the stack
        return stack;
    }

    public ArrayDeque<Integer> useArrayDeque() {
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        //  - add 5, 6, 8, 9 to the queue
        queue.add(5);
        queue.add(6);
        queue.add(8);
        queue.add(9);
        //  - print the first element of the queue on the screen
        System.out.print(queue.peekFirst());
        //  - print the last element of the queue on the screen
        System.out.print(queue.peekLast());
        //  - invoke the method poll() on the queue and print the result on the screen
        System.out.print(queue.poll());
        //  - invoke the element() method on the queue and print the result on the screen
        System.out.print(queue.element());
        //  - return the queue
        return queue;
    }

    public HashMap<Integer, String> useHashMap() {
        HashMap<Integer, String> hashMap = new HashMap<>();

        //  - add {1, TypeScript} entry to the map
        hashMap.put(Integer.valueOf(1), "TypeScript");
        //  - add {2, Kotlin} entry to the map
        hashMap.put(Integer.valueOf(2), "Kotlin");
        //  - add {3, Python} entry to the map
        hashMap.put(Integer.valueOf(3), "Python");
        //  - add {4, Java} entry to the map
        hashMap.put(Integer.valueOf(4), "Java");
        //  - add {5, JavaScript} entry to the map
        hashMap.put(Integer.valueOf(5), "JavaScript");
        //  - add {6, Rust} entry to the map
        hashMap.put(Integer.valueOf(6), "Rust");
        //  - determine the set of keys from the map and print it on the screen
        System.out.print(hashMap.keySet());
        //  - determine the set of values from the map and print it on the screen
        System.out.print(hashMap.values());
        //  - determine whether the map contains "English" as a language and print the result on the screen
        System.out.print(hashMap.containsValue("English"));
        //  - return the map
        return hashMap;
    }

    public String getName() {
        return "Collections Exercises";
    }
}
