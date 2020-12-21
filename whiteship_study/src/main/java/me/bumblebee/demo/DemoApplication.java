package me.bumblebee.demo;

import me.bumblebee.demo.post.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        Person gildong = new Person("gildong");
        Person youngsu = new Person("youngsu");

        gildong.eat(); // 길동이 밥을 먹다.
        youngsu.eat(); // 영수가 밥을 먹다.

    }

}
