package chapter2;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();
        List<Integer> lst = new ArrayList<>();

        // Thread 1: Adding elements
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                vector.add(i);
                lst.add(i);
                System.out.println("Thread 1 added: " + i);
            }

        }).start();
        // Thread 2: Adding elements
        new Thread(() -> {
            for (int i = 5; i < 10; i++) {
                vector.add(i);
                lst.add(i);
                System.out.println("Thread 2 added: " + i);
            }
        }).start();
    }

}
