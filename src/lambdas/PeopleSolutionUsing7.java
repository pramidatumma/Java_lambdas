package lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PeopleSolutionUsing7 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Pramida", "Tumma", 30),
                new Person("Teja", "Tumma", 25),
                new Person("Jeevan", "Tumma", 20),
                new Person("Bat", "man", 35)
        );

        //Sort by first name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });
        //print elements in the list
        printAll(people);

        //print all people with last name beginning with T
//        printLastNameBegininningWithT(people);
        System.out.println("\nPrint all Persons with Last name beginning with T");
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("T");
            }
        });

        System.out.println("\nPrint all Persons with Last name beginning with m");
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("m");
            }
        });
    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person p : people) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }
    }

    private static void printLastNameBegininningWithT(List<Person> people) {
        for (Person p : people) {
            if (p.getLastName().startsWith("T")) {
                System.out.println(p);
            }
        }
    }

    private static void printAll(List<Person> people) {
        System.out.println("Print all Persons");
        for (Person p : people) {
            System.out.println(p);
        }
    }

}


