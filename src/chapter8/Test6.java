package chapter8;

import java.util.Map;

public class Test6 {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("apple", 3, "banana", 5, "cherry", 2);
//        apple.put("test", 1);

        Map<String, Integer> stringIntegerMap = Map.copyOf(map);

//        apple.forEach((k,v)-> System.out.println(k + " " + v));
        stringIntegerMap.forEach((k,v) -> System.out.println(k + " " +v));
    }
}
`