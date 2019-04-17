package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String room,PoemDecorator poemDecorator) {

        String result = poemDecorator.decorate(room);
        System.out.println("ABC" +" "+ result);
    }
}


