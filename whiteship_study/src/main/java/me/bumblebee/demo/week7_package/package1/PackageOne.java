package me.bumblebee.demo.week7_package.package1;

public class PackageOne {
    protected static int num1 = 100;

    public void print() {
        System.out.println(this.num1++);
    }

    public int getNum() {
        return this.num1;
    }
}
