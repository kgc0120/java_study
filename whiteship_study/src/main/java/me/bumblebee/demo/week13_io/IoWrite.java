package me.bumblebee.demo.week13_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IoWrite {

    public static void main(String[] args) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:/Users/samsung/IdeaProjects/java_study/whiteship_study/src/main/java/me/bumblebee/demo/week13_io/testwrite.txt"));
        bufferedWriter.write("FileWriter 테스트입니다. " + "\r\n");
        bufferedWriter.write("참 쉽죠잉?" + "\r\n");
        bufferedWriter.flush();

    }
}
