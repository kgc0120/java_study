package me.bumblebee.demo.week8_interface;

public class AnimalMain {

    public static void main(String[] args) {

//        Cat cat = new Cat();
//        Dog dog = new Dog();
//
//        printNmae(cat);
//        printNmae(dog);

        Animal.print();

    }

    public static void printNmae(Animal animal) {
        System.out.println(animal.getName());
    }
}


