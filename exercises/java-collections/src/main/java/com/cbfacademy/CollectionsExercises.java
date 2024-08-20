package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        LinkedList<Integer> integersList = new LinkedList<>();
        integersList.add(4);
        integersList.add(5);
        integersList.add(6);
        integersList.add(8);
        integersList.add(2);
        integersList.add(9);
        integersList.addLast(2);
        integersList.add(2, 4);
        Integer firstElement = integersList.element(); 
        System.out.println(firstElement); 
        return integersList;   
    }

    public Stack<Integer> useStack() {
        Stack<Integer> stack = new Stack<>();
        stack.add(5);
        stack.add(6);
        stack.add(8);
        stack.add(9);
        System.out.print(stack.firstElement());
        System.out.print(stack.lastElement());
        System.out.print(stack.pop());
        stack.push(4);
        return stack;
    }

    public ArrayDeque<Integer> useArrayDeque() {
        ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
        queue.add(5);
        queue.add(6);
        queue.add(8);
        queue.add(9);
        System.out.print(queue.getFirst());
        System.out.print(queue.getLast());
        System.out.print(queue.poll());
        System.out.print(queue.element());
        return queue;
    }
    
    public HashMap<Integer, String> useHashMap() {
        HashMap<Integer, String> hash = new HashMap<>();     
        hash.put(1, "TypeScript");
        hash.put(2, "Kotlin");
        hash.put(3, "Python");
        hash.put(4, "Java");
        hash.put(5, "JavaScript");
        hash.put(6, "Rust");
        System.out.print(hash.keySet());
        System.out.print(hash.values());
        System.out.print(hash.containsValue("English"));
        return hash;

    }

    public String getName() {
        return "Collections Exercises";
    }
}
