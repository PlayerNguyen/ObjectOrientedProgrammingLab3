package com.github.playernguyen.question1.a;

public class Cat  extends Mammal{

    public Cat(String name) {
        super(name);
    }

    public void greets() {
        System.out.print("Meow");
    }

    @Override
    public String toString() {
        return String.format("Cat[%s]", super.toString());
    }
}
