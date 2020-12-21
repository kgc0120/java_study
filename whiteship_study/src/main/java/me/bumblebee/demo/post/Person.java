package me.bumblebee.demo.post;

public class Person { // 객체

    static String name; // 필드
    int age;
    int height;
    int weight;

    public Person(String name) { // 생성자
        this.name = name;
    }

    public void eat() { //메서드
        System.out.println(name + " 밥을 먹다.");
    }
}


