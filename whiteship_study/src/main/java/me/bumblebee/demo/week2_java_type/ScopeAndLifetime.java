package me.bumblebee.demo.week2_java_type;

public class ScopeAndLifetime {

    int num1, num2;   //Instance Variables
    static int result;  //Class Variable
    int add(int a, int b){  //Local Variables
        num1 = a;
        num2 = b;
        return a+b;
    }

    public static void main(String[] args) {
            ScopeAndLifetime ob = new ScopeAndLifetime();
            result = ob.add(10, 20);
            System.out.println("Sum = " + result);
    }
}



