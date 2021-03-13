package me.bumblebee.demo.week14_generic;

public class Box<T> {

    T genericElement;

    public T getGenericElement() {
        return genericElement;
    }

    public void setGenericElement(T genericElement) {
        this.genericElement = genericElement;
    }

}

