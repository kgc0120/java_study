package me.bumblebee.demo.week2_java_type;

public class TypeMain {

    public static void main(String[] args) {
        int int_v1 = 0b10;  // 0b -> 2진수
        int int_v2 = 010;   // 0 -> 8진수
        int int_v3 = 10;    // 없음 -> 10진수
        int int_v4 = 0x10;  // 0x -> 16진수

        long long_v1 = 123l; // l,L -> long 타입 리터럴

        float float_v1 = 1.23f; // f, F -> float 타입 리터럴


        System.out.println(int_v1);
        System.out.println(int_v2);
        System.out.println(int_v3);
        System.out.println(int_v4);

        System.out.println(long_v1);
        System.out.println(float_v1);
    }

}
