package me.bumblebee.demo.week8_interface;

public interface Animal extends AnimalFuc, Comparable{

    String getName();

    default String getType() {
        return "";
    }

    static void print() {
        System.out.println("interface static method");
    }

    private static void privateMethod() {

    }
}




