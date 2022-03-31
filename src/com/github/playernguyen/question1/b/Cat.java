package com.github.playernguyen.question1.b;

public class Cat extends Animal {


    public Cat(String name) {
        super(name);
    }

    @Override
    public void greats() {
        System.out.print("Meow");
    }
}
