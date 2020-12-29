package queue;

import java.util.LinkedList;
import java.util.Scanner;

public class Queue {

    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            String command = scanner.next();
            switch (command) {
                case "push" :
                    int num = scanner.nextInt();
                    queue.add(num);
                    break;
                case "pop" :
                    if(queue.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(queue.removeFirst());
                    }
                    break;
                case "size" :
                    System.out.println(queue.size());
                    break;
                case "empty" :
                    if(queue.isEmpty()) {
                        System.out.println("1");
                    } else {
                        System.out.println("0");
                    }
                    break;
                case "front" :
                    System.out.println(queue.getFirst());
                    break;
                case "back" :
                    System.out.println(queue.getLast());
                    break;
            }
        }


    }
}
