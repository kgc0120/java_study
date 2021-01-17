package me.bumblebee.demo.week8_interface;

public interface Animal extends AnimalFuc, Comparable{

    String getName();

    default String getType() {
//        privateMet();
        return "";
    }

    static void print() {
        System.out.println("interface static method");
    }

//    private void privateMet() {
//        System.out.println("private methoed");
//    }
//
//    private static void staticPrivateMet() {
//
//    }

}




