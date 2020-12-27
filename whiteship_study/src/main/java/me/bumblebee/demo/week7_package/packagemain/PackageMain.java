package me.bumblebee.demo.week7_package.packagemain;

import me.bumblebee.demo.week7_package.package1.PackageOne;


public class PackageMain {

    public static void main(String[] args) {
        PackageOne packageOne = new PackageOne();
        PackageOne packageOne2 = new PackageOne();
        packageOne.print();
        packageOne2.print();
        System.out.println(packageOne.getNum());

    }

    public static void print(){
        System.out.println("main print");
    }
}

