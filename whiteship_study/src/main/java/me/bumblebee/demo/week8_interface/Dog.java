package me.bumblebee.demo.week8_interface;

public class Dog implements Animal{

    @Override
    public String getName() {
        String name = "강아지";
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


