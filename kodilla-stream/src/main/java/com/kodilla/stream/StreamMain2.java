package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain2 {
    public static void main(String[] args) {
        PoemBeautifier beautify = new PoemBeautifier();

        beautify.beautify("ABC", (s) -> s.toUpperCase());
        beautify.beautify("ABC", (s) -> s.toLowerCase());
        beautify.beautify("ABC", (s) -> s.toUpperCase() + " " + "ABC");
        beautify.beautify("ABC", (s) -> s.toLowerCase() + " " + "ABC");

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}