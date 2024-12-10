package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // create an empty linked list
        LinkedList<Integer> list = new LinkedList<>();
        //  - add 4 as the first element of the list
        list.addFirst(4);
        //  - then add 5, 6, 8, 2, 9 to the list
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(2);
        list.add(9);
        //  - add another 2 as the last element of the list
        list.addLast(2);
        //  - add 4 as the 3rd element of the list
        list.add(2, 4);
        //  - invoke the method element() on the list and print the result on the screen
        System.out.println("Fisrt element using element(): " + list.element());
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
        System.out.println("Top element of the stack: " + stack.peek());
        //  - print the last element of the stack on the screen
        System.out.println("bottom element of the stack: " + stack.firstElement());
        //  - invoke the method pop() on the stack and print the result on the screen
        System.out.println("Popped element: " + stack.pop());
        //  - invoke the push(4) method on the stack
        stack.push(4);
        //  - return the stack
        return stack;
        }

    public ArrayDeque<Integer> useArrayDeque() {
        // Create an empty arrayDeque
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        //  - add 5, 6, 8, 9 to the queue
        queue.add(5);
        queue.add(6);
        queue.add(8);
        queue.add(9);
        //  - print the first element of the queue on the screen
        System.out.println("First element in the queue: " + queue.peekFirst());
        //  - print the last element of the queue on the screen
        System.out.print("Last element in the queue: " + queue.peekLast());
        //  - invoke the method poll() on the queue and print the result on the screen
        System.out.println("polled element: " + queue.poll());
        //  - invoke the element() method on the queue and print the result on the screen
        System.out.println("First element using element(): " + queue.element ());
        //  - return the queue
        return queue;
        }

    public HashMap<Integer, String> useHashMap() {
        // Create an empty hash map
        HashMap<Integer, String> map = new HashMap<>();
        //  - add {1, TypeScript} entry to the map
        map.put(1,"typeScript");
        //  - add {2, Kotlin} entry to the map
        map.put(2, "Kotlin");
        //  - add {3, Python} entry to the map
        map.put(3, "Python");
        //  - add {4, Java} entry to the map
        map.put(4, "Java");
        //  - add {5, JavaScript} entry to the map
        map.put(5, "JavaScript");
        //  - add {6, Rust} entry to the map
        map.put(6, "Rust");
        //  - determine the set of keys from the map and print it on the screen
        System.out.println("Keys in the map: " + map.keySet());
        //  - determine the set of values from the map and print it on the screen
        System.out.println("Values in the map: " + map.values());
        //  - determine whether the map contains "English" as a language and print the result on the screen
        System.out.println("Map contains 'English': " + map.containsValue("English"));
        //  - return the map
        return map;
        }

    public String getName() {
        return "Collections Exercises";
    }

    public static void main(String[] args) {
        CollectionsExercises exercises = new CollectionsExercises();

        System.out.println("LinkedList: " + exercises.useLinkedList());
        System.out.println("Stack: " + exercises.useStack());
        System.out.println("ArrayDeque: " + exercises.useArrayDeque());
        System.out.println("HashMap: " + exercises.useHashMap());
    }
}
