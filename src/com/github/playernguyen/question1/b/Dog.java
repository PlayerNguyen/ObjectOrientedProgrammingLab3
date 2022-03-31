package com.github.playernguyen.question1.b;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void greats() {
        System.out.println("Woof");
    }

    public void greats(Dog another) {
        System.out.println("Woooof");
    }
}
