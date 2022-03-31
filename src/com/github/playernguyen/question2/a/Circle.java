package com.github.playernguyen.question2.a;

public class Circle extends Shape {

    private double radius = 1.0f;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return 2D * this.radius * Math.PI;

    }

    @Override
    public String toString() {
        return String.format("Circle[%s,%s]", super.toString(), this.radius);
    }
}
