package me.bumblebee.demo.week13_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IoWrite {

    public static void main(String[] args) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:/Users/samsung/IdeaProjects/java_study/whiteship_study/src/main/java/me/bumblebee/demo/week13_io/testwrite.txt"));
        bufferedWriter.write("FileWriter는 한글로된 " + "\r\n");
        bufferedWriter.write("문자열을 바로 출력할 수 잆다." + "\r\n");
        bufferedWriter.write("show me the money");

        bufferedWriter.flush();

        System.out.println("파일에 저장되었습니다.");
    }
}
