package chapter2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 22));
        people.add(new Person("Charlie", 25));

        people.sort(Comparator.comparing(Person::getAge, Comparator.comparing(Integer::intValue))
                .thenComparing(Person::getName));

//        people.sort(Comparator.comparingInt(Person::getAge));
//        Collections.sort(people);
//        System.out.println(people);

//        people.sort(Comparator.comparing(Person::getName));
//        people.forEach(System.out::println);


        people.sort(Comparator.comparing(Person::getAge, Comparator.comparing(Integer::intValue))
                .thenComparing(Person::getName));

//        people.sort(Comparator.naturalOrder());
////        Collections.sort(people);
//
//        people.forEach(System.out::println);
//
//        System.out.println(Integer.compare(10, 20));
//        System.out.println(Long.compare(20L, 10L));
//        System.out.println(Double.compare(10.0, 20.0));
//        System.out.println(Float.compare(20, 10));
//        System.out.println(Character.compare('a', 'b'));
//        System.out.println(String.CASE_INSENSITIVE_ORDER.compare("hi" ,"ho"));




    }
}
