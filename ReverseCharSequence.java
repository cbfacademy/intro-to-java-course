package com.cbfacademy.words;

public class ReverseCharSequence implements CharSequence {
      private String original;

      public ReverseCharSequence(String original) {
        this.original = original;
      }

      @Override
      public int length(){
         return original.length();
      }

      @Override
       public char charAt(int index) {
        return original.charAt(original.length() - 1 - index);
      }

      @Override
      public CharSequence subSequence(int start, int end) {
        StringBuilder SubSequence = new StringBuilder(original.substring(start, end));
        return SubSequence.reverse().toString();
      }

      @Override
      public String toString() {
        return new StringBuilder(original).reverse().toString();
      }

      public static void main(String[] args) {
        ReverseCharSequence reverse = new ReverseCharSequence("Happy Coding");
        System.out.println(reverse.toString()); // Output: "gnidoC yppaH"
      }
    }

      

