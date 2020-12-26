package me.bumblebee.demo.week6_inheritance;


public class Parent {

    public void subtract(int a, int b) {
        System.out.println("Parent sub = " + (b - a));
    }
    public void add(int a, int b) {
        System.out.println("Parent add = " + (a + b));
    }


    public static void main(String[] args) {
        Child child = new Child();
        child.subtract(10, 20); // Parent method
        child.add(10, 20); // Override method

        Parent child2 = new Child(); // 동적 디스패치
        child2.add(10, 20);
        Child child3 = new Child(); // 정적 디스패치
        child3.add(20, 30);
    }
}

class Child extends Parent{
    @Override
    public void add(int a, int b) {
        System.out.println("Child add = " + (a + b));
    }
}


