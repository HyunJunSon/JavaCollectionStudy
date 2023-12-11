package chapter8;

import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {

        long count = Stream.of(1, 2, 423, 654, 6, 4637, 65, 154, -1212, 20 - 12, 12812 - 1219)
                .filter(x-> x>0)
                .count();

        System.out.println(count);



    }
}
