package me.bumblebee.demo.week8_interface;

public class Cat implements Animal{

    @Override
    public String getName() {
        String name = "고양이";
        return name;
    }

    @Override
    public String sound() {
        return null;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}


