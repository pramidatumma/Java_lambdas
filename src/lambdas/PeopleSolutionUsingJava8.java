package lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class PeopleSolutionUsingJava8 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Pramida", "Tumma", 30),
                new Person("Teja", "Tumma", 25),
                new Person("Jeevan", "Tumma", 20),
                new Person("Bat", "man", 35)
        );

        //Sort by first name
        Collections.sort(people, (p1,p2)-> p1.getFirstName().compareTo(p2.getFirstName()));

        //print elements in the list
        printConditionally(people, p->true);

        //print all people with last name beginning with T
        System.out.println("\nPrint all Persons with Last name beginning with T");
        printConditionally(people, p->p.getLastName().startsWith("T"));

        System.out.println("\nPrint all Persons with Last name beginning with m");
        printConditionally(people, p->p.getLastName().startsWith("m"));
    }

    private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
        for (Person p : people) {
            if (predicate.test(p)) {
                System.out.println(p);
            }
        }
    }
}