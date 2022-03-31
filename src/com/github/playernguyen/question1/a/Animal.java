package com.github.playernguyen.question1.a;

public class Animal {

    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Animal[name=\"%s\"]", this.name);
    }
}
