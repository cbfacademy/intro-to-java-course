package com.cbfacademy.words;

public class ReverseCharSequence implements CharSequence {
    private final String str;

    public ReverseCharSequence(String str) {
        this.str = str;
    }

    @Override
    public int length() {
        return str.length();
    }

    @Override
    public char charAt(int index) {
        return str.charAt(str.length() - 1 - index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new ReverseCharSequence(str.substring(str.length() - end, str.length() - start));
    }

    @Override
    public String toString() {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        ReverseCharSequence reversed = new ReverseCharSequence("My name is Gifty Acquah");
        System.out.println(reversed.toString()); 
    }
}