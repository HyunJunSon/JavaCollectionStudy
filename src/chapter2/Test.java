package chapter2;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.Vector;

public class Test {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>(20,3);
//        vector.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//        Integer[] arr = new Integer[10];
//        vector.copyInto(arr);
//
//        System.out.println("현재 capacity");
//        System.out.println(vector.capacity());
//        System.out.println("현재 capacity");
//        vector.ensureCapacity(20);
//        System.out.println("ensureCapacity 이후");
//        System.out.println(vector.capacity());

//        System.out.println(vector.firstElement());
//        Vector<Integer> vector = new Vector<>(10,3);
//        vector.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//        ListIterator<Integer> listIterator = vector.listIterator(3);
//        while(listIterator.hasPrevious()){
//            System.out.println(listIterator.previous());
//        }
//
        //removeif test
        vector.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,122,121,12,12));

//        vector.removeIf(n -> n % 2 == 0);
//        vector.forEach(n -> System.out.print(n+" "));

//        vector.replaceAll(n -> n+1);
//        vector.forEach(n-> System.out.print(n +" "));

        System.out.println(vector.size());
        System.out.println(vector.capacity());
        vector.trimToSize();
        System.out.println(vector.capacity());


    }
}
