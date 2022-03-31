package com.github.playernguyen.question1.b;

public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greats() {
        System.out.println("Wooow");
    }

    @Override
    public void greats(Dog another) {
        System.out.println("Woooooow");
    }

    public void greats(BigDog another) {
        System.out.println("Woooooooooow");
    }
}
