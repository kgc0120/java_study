package me.bumblebee.demo.week12_annotation;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import java.lang.annotation.*;

@Documented
public @interface MyAnnotation {

    String name();
    int age();
    String myJob() default "N/A";
}


