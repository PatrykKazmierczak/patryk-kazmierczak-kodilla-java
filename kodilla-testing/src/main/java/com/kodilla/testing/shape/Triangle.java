package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private static String name = "Triangle";
    private double sideLengthA;
    private double sideLengthB;
    private double sideLengthC;

    public Triangle(double sideLengthA, double sideLengthB, double sideLengthC) {
        this.sideLengthA = sideLengthA;
        this.sideLengthB = sideLengthB;
        this.sideLengthC = sideLengthC;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!( o instanceof Triangle )) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.sideLengthA, sideLengthA) != 0) return false;
        if (Double.compare(triangle.sideLengthB, sideLengthB) != 0) return false;
        return Double.compare(triangle.sideLengthC, sideLengthC) == 0;
    }
    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(sideLengthA);
        result = (int) ( temp ^ ( temp >>> 32 ) );
        temp = Double.doubleToLongBits(sideLengthB);
        result = 31 * result + (int) ( temp ^ ( temp >>> 32 ) );
        temp = Double.doubleToLongBits(sideLengthC);
        result = 31 * result + (int) ( temp ^ ( temp >>> 32 ) );
        return result;
    }
    @Override
    public String getShapeName() {
        return null;
    }
    @Override
    public double getField() {
        return 0;
    }
}
