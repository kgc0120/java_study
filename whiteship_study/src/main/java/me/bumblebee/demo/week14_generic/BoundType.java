package me.bumblebee.demo.week14_generic;

public class BoundType <T extends Number>{

    public void set(T value) {}

    public static void main(String[] args) {
        BoundType<Integer> integerBoundType = new BoundType<>();
        integerBoundType.set("숫자만");
    }

}
