package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier beautify = new PoemBeautifier();

        beautify.beautify("ABC",(s)->s.toUpperCase());
        beautify.beautify("ABC",(s)->s.toLowerCase());
        beautify.beautify("ABC",(s)->s.toUpperCase()+" " + "ABC");
        beautify.beautify("ABC",(s)->s.toLowerCase()+" " + "ABC");
    }
}