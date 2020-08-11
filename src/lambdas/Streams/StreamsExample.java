package lambdas.Streams;

import lambdas.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Pramida", "Tumma", 30),
                new Person("Teja", "Tumma", 25),
                new Person("Jeevan", "Tumma", 20),
                new Person("Bat", "man", 35)
        );
        //Filter people with last name starting with T
        //Create new instance
        //Print the list from that instance
        Stream<Person> filteredPeople = people.stream()
                .filter(p->p.getLastName().startsWith("T"));
//                .forEach(p->System.out.println(p.getFirstName()));
        filteredPeople.forEach(p->System.out.println(p)); // Prints only the filtered people
        people.forEach(p->System.out.println(p)); // Prints all the people

        System.out.println(people.stream()
                .filter(p->p.getLastName().startsWith("T"))
                .count());


    }
}
