package me.bumblebee.demo.week11_enum;

import java.util.EnumSet;

public class EnumMain {

    public static void main(String[] args) {
        EnumSet<Colors> colorAllof, colorOf, colorComplementOf, colorRange, colorNoneOf;
        colorAllof = EnumSet.allOf(Colors.class); //전체 출력
        colorOf = EnumSet.of(Colors.RED, Colors.GREEN); // 특정 값 출력
        colorComplementOf = EnumSet.complementOf(colorOf); // 특정 값 제외하고 출력
        colorRange = EnumSet.range(Colors.BULE, Colors.GREEN); // 해당 범위의 상수만 출력
        colorNoneOf = EnumSet.noneOf(Colors.class); // 비어있는 EnumSet

        System.out.println("allOf = " + colorAllof);
        System.out.println("of = " + colorOf);
        System.out.println("complementOf = " + colorComplementOf);
        System.out.println("range = " + colorRange);
        System.out.println("noneOf = " + colorNoneOf);
    }
}
enum Colors {
    RED, BULE, GREEN, BLACK, WHITE;
}


enum Fruit {
    APPLE, BANANA
}
enum Company {
    APPLE, GOOGLE
}


//class Fruit {
//    public static final Fruit APPLE = new Fruit();
//    public static final Fruit BANANA = new Fruit();
//}
//
//class Company {
//    public static final Company APPLE = new Company();
//    public static final Company GOOGLE = new Company();
//}

