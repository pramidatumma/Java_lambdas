package lambdas.LambdasMethodReferences;

import lambdas.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIteration {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Pramida", "Tumma", 30),
                new Person("Teja", "Tumma", 25),
                new Person("Jeevan", "Tumma", 20),
                new Person("Bat", "man", 35)
        );

        //Various ways of iterations
        System.out.println("For loop - external iterator");
        for(int i=0;i< people.size();i++) {
            System.out.println(people.get(i));
        }

        System.out.println("For In loop - external iterator");
        for(Person p: people) {
            System.out.println(p);
        }

        System.out.println("For  each loop - Internal iterator");
        //Calling new method on each of the elements
        people.forEach(p->System.out.println(p));

        System.out.println("For  each loop - Internal iterator - Using Method References");
        //Using MethodReferences
        people.forEach(System.out::println); //Can run things parallely if needed
    }
}
