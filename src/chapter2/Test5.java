package chapter2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(null); // Adding a null entry
        people.add(new Person("Charlie", 25));
        people.add(new Person("Bob", 22));
        people.add(null); // Another null entry

        // Comparator for Person objects by name, with nulls first


        // Sort the list using the nullsFirst comparator
        people.sort(Comparator.nullsFirst(Comparator.comparing(Person::getName)));

        System.out.println(people);
    }

}
