package com.cbfacademy;

import java.util.*;
import java.util.List;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        LinkedList<Integer> integers = new LinkedList<>();
        integers.addFirst(4);
        // - add 4 as the first element of the list
        // - then add 5, 6, 8, 2, 9 to the list
        integers.add(5);
        integers.add(6);
        integers.add(8);
        integers.add(2);
        integers.add(9);
        // - add another 2 as the last element of the list
        integers.addLast(2);
        // - add 4 as the 3rd element of the list
        integers.add(2, 4);
        // - invoke the method element() on the list and print the result on the screen
        // - return the list
        System.out.println(integers.element());
        // throw new RuntimeException("Not implemented");
        return integers;
    }

    public Stack<Integer> useStack() {
        // TODO: create an empty stack
        Stack<Integer> stackElement = new Stack<>();
        stackElement.push(5);

        // - add 5, 6, 8, 9 to the stack
        stackElement.push(6);
        stackElement.push(8);
        stackElement.push(9);

        // - print the first element of the stack on the screen
        System.out.println(stackElement.firstElement());
        // - print the last element of the stack on the screen
        System.out.println(stackElement.lastElement());// .getLast()
        // - invoke the method pop() on the stack and print the result on the screen
        System.out.println(stackElement.pop());

        // - invoke the push(4) method on the stack
        stackElement.push(4);
        // - return the stack
        return stackElement;
        // throw new RuntimeException("Not implemented");
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        ArrayDeque<Integer> queueElement = new ArrayDeque<>();
        queueElement.add(5);
        // - add 5, 6, 8, 9 to the queue
        queueElement.add(6);
        queueElement.add(8);
        queueElement.add(9);
        // - print the first element of the queue on the screen
        System.out.println(queueElement.getFirst());
        // - print the last element of the queue on the screen
        System.out.println(queueElement.getLast());
        // - invoke the method poll() on the queue and print the result on the screen
        System.out.println(queueElement.poll());
        // - invoke the element() method on the queue and print the result on the screen
        queueElement.element();
        // - return the queue
        return queueElement;
        // throw new RuntimeException("Not implemented");
    }

    public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map
        HashMap<Integer, String> hashmap = new HashMap<>();
        hashmap.put(1, "TypeScript");
        hashmap.put(2, "Kotlin");
        hashmap.put(3, "Python");
        hashmap.put(4, "Java");
        hashmap.put(5, "JavaScript");
        hashmap.put(6, "Rust");
        System.out.println(hashmap.keySet());
        System.out.println(hashmap.values());
        System.out.println(hashmap.containsValue("English"));
        return hashmap;

    }

    public String getName() {
        return "Collections Exercises";
    }
}
