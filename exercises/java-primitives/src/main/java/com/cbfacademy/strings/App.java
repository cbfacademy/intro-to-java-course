package com.cbfacademy.strings;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        String word1 = "Hello";
        String word2 = "World";
        String word3 = "!";


    }

    public static String concatenate(String word1, String word2, String word3) {
        // TODO: Write code that concatenates the input parameters and returns the result
        //throw new RuntimeException("Not implemented");
        String result1 = word1 + word2 + word3;
        System.out.println(result1);
        // system.out.println will print out the result of the concatenation of the three strings. the answer is HelloWorld!.
    }

    public static Boolean areEqual(String word1, String word2) {
        // TODO: Write code to determine whether the input parameters are equal strings
        // throw new RuntimeException("Not implemented");
        Boolean result2 = word1.equals(word2);
        System.out.println(result2);
        // system.out.println will print out the result of the boolean expression. the answer is false bebcause the strings are not equal.
    }

    public static String format(String item, int quantity, double price) {
        // TODO: Write code to return a string formatted as follows: "Item: [item]. Price: £[amount]. Quantity: [quantity]". The date should be formatted as DD/MM/YYYY, e.g. 24/10/2023
        // throw new RuntimeException("Not implemented");
        string item = "apple";
        int quantity = 5;
        double price = 0.50;

        String result3 = "Item: " + item + ". Price: £" + price + ". Quantity: " + quantity;
        System.out.println(result3);
        // system.out.println will print out the result of the concatenation of the three strings. the answer is Item: apple. Price: £0.50. Quantity: 5.
    }
}
// now i will need to upload this into github.
// i will need to create a new repository in github.
// i will need to name the repository as strings.
// i will need to add a description.
// i will need to add a readme file.
// i will need to add a gitignore file.
// i will need to add a license.
// i will need to click on create repository.
// i will need to copy the url.
// i will need to go to the terminal.
// i will need to type in git clone and paste the url.
// i will need to type in cd strings.
// i will need to type in ls.
// i will need to type in code .
// i will need to type in git status.
// i will need to type in git add .
// i will need to type in git commit -m "added the strings homework".
// i will need to type in git push.
// i will need to type in git status.
// i will need to type in git log.
// i have fork the repository from the cbf-academey and cloned it into my local machine. 
// once i have done that i will need to create a new branch. the reason why i will need to create a new branch is because i will need to make changes to the code and then push it back to the master branch.
// i will need to type in git checkout -b strings.
// i will need to type in git branch.
// i will need to type in git status.
// i will need to type in git add .
// i will need to type in git commit -m "added the strings homework".
// i will need to type in git push.
// i will need to type in git status.
// i will need to type in git log.
// i will need to type in git checkout master.
// i will need to type in git merge strings.
// the branch will be called homework as i will be doing the homework.
// once branch is created i will need to type in git checkout homework.
// this will take me to the homework branch.
// to save the changes i will need to type in git add .