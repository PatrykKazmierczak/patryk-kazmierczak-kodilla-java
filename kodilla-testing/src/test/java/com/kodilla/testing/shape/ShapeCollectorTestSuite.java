package com.kodilla.testing.shape;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShapeCollectorTestSuite {


    @Test
    public void addFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(6);
        //When
        shapeCollector.addFigure(shape);
        //Then
        assertEquals(1,shapeCollector.getShapeCollection().size());
    }
    @Test
    public void removeFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(4);
        shapeCollector.addFigure(shape);
        //When
        boolean result = shapeCollector.removeFigure(shape);
        //Then
        assertTrue(result);
        assertEquals(0,shapeCollector.getShapeCollection().size());
    }
    @Test
    public void getFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(4);
        shapeCollector.addFigure(shape);
        //When
        Shape shapeResult = shapeCollector.getFigure(0);
        //Then
        assertEquals(shape,shapeResult);
    }
    @Test
    public void showFigures() {
    }
}
