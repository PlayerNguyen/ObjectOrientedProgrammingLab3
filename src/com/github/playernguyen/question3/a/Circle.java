package com.github.playernguyen.question3.a;

public class Circle implements GeometricObject{
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return String.format("Circle[radius=%s]", this.radius);
    }
}
