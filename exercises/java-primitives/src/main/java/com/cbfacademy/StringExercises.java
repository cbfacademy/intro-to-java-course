package com.cbfacademy;

public class StringExercises {

    public String fromCharacters(char[] characters) {
        return new String(characters);
    }

    public Long howMany(String text, Character character) {
        Long count = 0L;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == character) {
                ++count;
            }
        }
        
        return count;
    }

    public Boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left <= right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }

            ++left;
            --right;
        }

        return true;
    }

    public String getName() {
        return "String Exercises";
    }
}
