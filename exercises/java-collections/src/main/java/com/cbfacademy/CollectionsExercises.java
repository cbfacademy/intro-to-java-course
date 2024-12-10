package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        LinkedList<Integer> list = new LinkedList<>();
        //  - add 4 as the first element of the list
        list.add(4); // first element
        //  - then add 5, 6, 8, 2, 9 to the list
        list.add(5); // second element
        list.add(6); // third element
        list.add(8); // fourth element
        list.add(2); // fifth element
        list.add(9); // sixt element
        //  - add another 2 as the last element of the list
        list.addLast(2);
        //  - add 4 as the 3rd element of the list
        list.add(2, 4);
        //  - invoke the method element() on the list and print the result on the screen
        System.out.println(list.element());

        //  - return the list
        return list;
    }

    public Stack<Integer> useStack() {
        // TODO: create an empty stack
        Stack<Integer> stack = new Stack<>();
        //  - add 5, 6, 8, 9 to the stack
        stack.push(5);
        stack.push(6);
        stack.push(8);
        stack.push(9);
        //  - print the first element of the stack on the screen
        System.out.print(stack.firstElement());
        //  - print the last element of the stack on the screen
        System.out.print(stack.peek());
        //  - invoke the method pop() on the stack and print the result on the screen
        System.out.print(stack.pop());
        //  - invoke the push(4) method on the stack
        stack.push(4);
        //  - return the stack
        return stack;
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        //  - add 5, 6, 8, 9 to the queue
        arrayDeque.add(5);
        arrayDeque.add(6);
        arrayDeque.add(8);
        arrayDeque.add(9);
        //  - print the first element of the queue on the screen
        System.out.print(arrayDeque.peekFirst());
        //  - print the last element of the queue on the screen
        System.out.print(arrayDeque.peekLast());
        //  - invoke the method poll() on the queue and print the result on the screen
        System.out.print(arrayDeque.poll());
        //  - invoke the element() method on the queue and print the result on the screen
        System.out.print(arrayDeque.element());
        //  - return the queue
        return arrayDeque;
    }
        
    public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map
        HashMap<Integer, String> hashMap = new HashMap<>();
        //  - add {1, TypeScript} entry to the map
        hashMap.put(1, "TypeScript");
        //  - add {2, Kotlin} entry to the map
        hashMap.put(2, "Kotlin");
        //  - add {3, Python} entry to the map
        hashMap.put(3, "Python");
        //  - add {4, Java} entry to the map
        hashMap.put(4, "Java");
        //  - add {5, JavaScript} entry to the map
        hashMap.put(5, "JavaScript");
        //  - add {6, Rust} entry to the map 
        hashMap.put(6, "Rust");
        //  - determine the set of keys from the map and print it on the screen
        Set<Integer> keys = hashMap.keySet();
        System.out.print(hashMap.keySet());
        //  - determine the set of values from the map and print it on the screen
        Collection<String> values = hashMap.values();
        System.out.print(hashMap.values());
        //  - determine whether the map contains "English" as a language and print the result on the screen
        System.out.print(hashMap.containsValue("English"));
        //  - return the map
        return hashMap;
    }

    public String getName() {
        return "Collections Exercises";
    }

    public static void main(String[] args) {
        CollectionsExercises exercises = new CollectionsExercises();
        // Test LinkedList
        LinkedList<Integer> resultList = exercises.useLinkedList();
        System.out.println("Final linked list: " + resultList);
         // Test Stack
         System.out.println("Final stack: " + resultStack);
         // Test ArrayDeque
        ArrayDeque<Integer> resultQueue = exercises.useArrayDeque();
        System.out.println("Final queue: " + resultQueue);
         // Test HashMap
         HashMap<Integer, String> resultMap = exercises.useHashMap();
         System.out.println("Final map: " + resultMap);
        } 
    }  