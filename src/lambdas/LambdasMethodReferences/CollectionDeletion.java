package lambdas.LambdasMethodReferences;

import lambdas.Person;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionDeletion {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Pramida", "Tumma", 30),
                new Person("Teja", "Tumma", 25),
                new Person("Jeevan", "Tumma", 20),
                new Person("Bat", "man", 35)
        );

        List<Person> list = new LinkedList<Person>(people);

//        System.out.println("For loop - external iterator - Misses iterating through the next element Jeevan");
//        for(int i=0;i< list.size();i++) {
//            if(list.get(i).getFirstName() == "Teja") {
//                list.remove(i);
//            }
//            else {
//                System.out.println(list.get(i));
//            }
//        }
//
//        System.out.println("Final list");
//
//        list.forEach(System.out::println);

        //--------------------------------------------
//        System.out.println("For  each loop - Internal iterator - Will Throw Cuncurrent modification exception");
//        //Calling new method on each of the elements
//        list.forEach(p->{
//            if(p.getFirstName() == "Teja") {
//                list.remove(p);
//            }
//            else {
//                System.out.println(p);
//            }
//        });
//        System.out.println("Final List");
//        list.forEach(System.out::println);
//
        //----------------------------------------------
        System.out.println("Using Iterators - This will work");
        Iterator<Person> iter = list.iterator();
        while (iter.hasNext()) {
            Person p = iter.next();
            if(p.getFirstName() == "Teja")
                iter.remove();
            else
                System.out.println(p);
        }

        System.out.println("Final List");
        list.forEach(System.out::println);
    }
}
