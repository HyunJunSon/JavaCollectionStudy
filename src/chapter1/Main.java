package chapter1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //way1
        List<Integer> lst = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,89,9));

        //way2
        List<Integer> lst2 = new ArrayList<>();
        Collections.addAll(lst2, 3,3,3,4,234,245,346,457,4);

        //listiterator

        ListIterator<Integer> listIterator= lst.listIterator(3);  // {4,5,6,7,8,89,9}

        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        // removerange

        lst2.subList(1,5).set(0,1);
        lst2.forEach(n -> System.out.print(n +" "));

    }
}