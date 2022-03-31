package com.github.playernguyen.question3.b;

public class ResizableCircle extends Circle implements Resizable{

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        this.radius *= percent/ 100.0;
    }

    @Override
    public String toString() {
        return String.format("ResizableCircle[%s]", super.toString());
    }
}
