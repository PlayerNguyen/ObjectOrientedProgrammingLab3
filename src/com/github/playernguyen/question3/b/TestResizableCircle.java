package com.github.playernguyen.question3.b;

import java.util.Scanner;

public class TestResizableCircle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Circle radius: ");
        int radius = scanner.nextInt();scanner.nextLine();
        ResizableCircle circle = new ResizableCircle(radius);

        System.out.println(circle);
        System.out.println((Circle)circle);

        System.out.println("Resize percentage: ");
        int resize = scanner.nextInt();scanner.nextLine();
        circle.resize(resize);


        System.out.println(circle.toString());

    }

}
