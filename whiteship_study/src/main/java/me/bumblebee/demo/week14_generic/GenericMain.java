package me.bumblebee.demo.week14_generic;

import java.util.Collections;

public class GenericMain {

    public static void main(String[] args) {
        GenericSample<String> genericSample = new GenericSample<>();
        genericSample.setGenericElement("제네릭!!");
//        genericSample.setGenericElement(123);

        GenericSample genericSample2 = new GenericSample();
        genericSample2.setGenericElement(123);


        String genericElement = genericSample.getGenericElement();
        Object genericElement1 = genericSample2.getGenericElement();
        System.out.println(genericElement);
        System.out.println(genericElement1);

//        GenericSample<String> genericSample_1 = new GenericSample<Integer>();
//        GenericSample<String> genericSample_2 = new GenericSample<String>();
//        GenericSample<String> genericSample_3 = new GenericSample<>(); // jdk 1.7 부터 생략 가능

        FruitBox<int> toyBox = new FruitBox<int>();
        FruitBox<Apple> appleBox = new FruitBox<>();

        Collections.sort();


    }
}
