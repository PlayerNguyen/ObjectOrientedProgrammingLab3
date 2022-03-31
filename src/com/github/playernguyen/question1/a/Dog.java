package com.github.playernguyen.question1.a;

public class Dog extends Mammal{
    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.print("Woof");
    }

    public void greets(Dog another) {
        System.out.print("Woooof");
    }
}
