package com.github.playernguyen.question2.a;

public class ShapeTest {

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        Circle circle = new Circle(12);
        System.out.printf("%s with perimeter %2f and area %s\n",
                circle,
                circle.getPerimeter(),
                circle.getArea()
        );

        Rectangle rect = new Rectangle(120, 240);
        System.out.printf("%s with perimeter %2f and area %s\n",
                rect,
                rect.getPerimeter(),
                rect.getArea()
        );

        Square square = new Square(12);
        System.out.printf("%s with perimeter %2f and area %s\n",
                square,
                square.getPerimeter(),
                square.getArea()
        );
    }

}
