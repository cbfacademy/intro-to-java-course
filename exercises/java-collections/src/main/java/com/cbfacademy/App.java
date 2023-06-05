package com.cbfacademy;

public class App {
    public static void main( String[] args ) {
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
