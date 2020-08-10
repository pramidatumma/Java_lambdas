package lambdas.LambdasMethodReferences;

import lambdas.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Pramida", "Tumma", 30),
                new Person("Teja", "Tumma", 25),
                new Person("Jeevan", "Tumma", 20),
                new Person("Bat", "man", 35)
        );

        //print elements in the list
        printConditionally(people, p->true, System.out::println); // Instead of p->System.out.println(p) --> use System.out::println.
        //We are passing a function here basically. Just that, it should match with the decalration where Consumer takes one arg and returns nothing and
        //println matches with it

//        printConditionally(people, p->p.getLastName().startsWith("m"));
    }

    private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p : people) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }
}
