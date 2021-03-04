package me.bumblebee.demo.week2_java_type;

public class TypeCasting {

    public static void main(String[] args) {
        int int_v1 = 10;
        long long_v1 = int_v1; // 타입 프로모션
        int_v1 = (int) long_v1; // 타입 캐스팅

        float float_v1= 1.23f;
        double double_V1 = float_v1; // 타입 프로모션
        float_v1 =  (float) double_V1; // 타입 캐스팅

        long long_v2 = (long) float_v1;
        System.out.println(float_v1);
        System.out.println(long_v2);

    }
}
