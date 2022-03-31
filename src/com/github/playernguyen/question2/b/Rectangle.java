package com.github.playernguyen.question2.b;

public class Rectangle extends Shape {

    private double width = 1.0D, length = 1.0D;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public double getPerimeter() {
        return (this.width + this.width) * 2;
    }

    @Override
    public String toString() {
        return String.format("Rectangle[%s,width=%s,length=%s]",
                super.toString(),
                this.width,
                this.length);
    }


}
