package me.bumblebee.demo.week9_exception;

public class ExceptionMain {

    public static void main(String[] args) {
        throwMethod(11);
    }

    public static void throwMethod(int num){
        if(num > 10) {
            throw new MyException("Unchecked My Exception");
        }
    }

}

