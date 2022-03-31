package com.github.playernguyen.question3.b;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input radius of circle: ");
        int r = scanner.nextInt();

        System.out.println(new Circle(r));
    }
}
