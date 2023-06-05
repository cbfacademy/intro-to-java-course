package com.cbfacademy;

public class StringExercises {

    public String fromCharacters(char[] characters) {
        // TODO - Write code that creates a String from the input array of characters
        String newString = new String(characters);
        System.out.println(newString);
        return newString;
    }

    public Long howMany(String text, Character character) {
        // TODO - Write code to determine how many of the input ${character} are contained in the input ${text}

        long count = 0;
    
        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == character) {
                count++;
            }
        }

        System.out.println(count);
        return count;
    }

    public Boolean isPalindrome(String word) {
        // TODO - Write code to determine whether the input ${word} is a palindrome
        String reversedWord = new StringBuilder(word).reverse().toString();
        if(word.equals(reversedWord)) {
            return true;
        }
        else {
            return false;
        }
    }

    public String getName() {
        return "String Exercises";
    }
    public static void main( String[] args ) {
        StringExercises lettersToString = new StringExercises();
        char individualCharacters[] = {'h', 'i'};
        char letters[] = {'h', 'e', 'l', 'l', 'o'};
        lettersToString.fromCharacters(individualCharacters);
        lettersToString.fromCharacters(letters);

        StringExercises countOccurance = new StringExercises();
        countOccurance.howMany("hello", 'l');

        StringExercises word = new StringExercises();
        word.isPalindrome("anna");
    }
}
