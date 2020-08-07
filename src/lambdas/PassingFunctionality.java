package lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PassingFunctionality {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Pramida", "Tumma", 30),
                new Person("Teja", "Tumma", 25),
                new Person("Jeevan", "Tumma", 20),
                new Person("Bat", "man", 35)
        );

        //Sort by first name
        Collections.sort(people, (p1, p2)-> p1.getFirstName().compareTo(p2.getFirstName()));

        //print elements in the list
        printConditionally(people, p->true, p->System.out.println(p));

        //print all people with last name beginning with T
        System.out.println("\nPrint all Persons with Last name beginning with T");
        printConditionally(people, p->p.getLastName().startsWith("T"), p->System.out.println(p));

        System.out.println("\nPrint all Persons with Last name beginning with m");
        printConditionally(people, p->p.getLastName().startsWith("m"), p->System.out.println(p));
    }

    private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p : people) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }
}
