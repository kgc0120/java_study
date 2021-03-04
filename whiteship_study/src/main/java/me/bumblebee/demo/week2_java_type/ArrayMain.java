package me.bumblebee.demo.week2_java_type;

public class ArrayMain {

    public static void main(String[] args) {
        int[][] array;
        array = new int[][]{{1,2},{3,4,5}};

        for (int i=0; i < array.length; i++) {
            for (int j=0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
