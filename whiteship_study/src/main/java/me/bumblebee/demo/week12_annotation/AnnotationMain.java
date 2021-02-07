package me.bumblebee.demo.week12_annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

/*
* java doc annotation
*
* @author bumblebee
* */
public class AnnotationMain {

    @MyAnnotation(name = "bumblebee", age = 27)
    // 정적인 값이 들어가야 한다.
    public static void main(String[] args) {
        MyLombok myLombok = new MyLombok();
        myLombok.setName("bumblebee");
        myLombok.setAge(27);
        System.out.println(myLombok.getName());
    }

}
