package chapter6;

import java.util.Arrays;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(3, 6, -4);
//        numberList.stream().map(n -> n * 2).forEach(System.out::println);
        numberList.stream().map(n -> "Number is "+ n).forEach(System.out::println);


    }
}
