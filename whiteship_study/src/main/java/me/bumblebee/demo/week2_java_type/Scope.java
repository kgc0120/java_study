package me.bumblebee.demo.week2_java_type;

public class Scope {

    public static void main(String[] args) {
        int x =10;
        {
            int y = x;
        }
        System.out.println(x);
    }
}


