package me.bumblebee.demo.week13_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IoMain {

    public static void main(String[] args) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:/Users/samsung/IdeaProjects/java_study/whiteship_study/src/main/java/me/bumblebee/demo/week13_io/testfile.txt"));

        int readCharNo = 0;
        char[] cbuf = new char[100];
        while ((readCharNo = bufferedReader.read(cbuf)) != -1) {
            String data = new String(cbuf, 0, readCharNo);
            System.out.print(data);
        }

    }

}
