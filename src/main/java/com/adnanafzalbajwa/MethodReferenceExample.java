package com.adnanafzalbajwa;

import models.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceExample {

    public static void main(String[] args) {

        Supplier<Double> randomInt1 = () -> Math.random();
//        The above can also be written as
        Supplier<Double> randomInt2 = Math::random;
        System.out.println(randomInt1.get());
        System.out.println(randomInt2.get());

//        More Examples
        Function<Person, String> givePersonName1 = p -> p.getName();
//        Above can also be written as
        Function<Person, String> givePersonName2 = Person::getName;
        System.out.println(givePersonName1.apply(new Person("Adnan", 31)));
        System.out.println(givePersonName2.apply(new Person("Kamran", 27)));


        Person p1 = new Person("Adnan", 31);
        Person p2 = new Person("Kamran", 27);
        BiPredicate<Person, Person> comparePerson1 = (per1, per2) -> per1.equals(per2);
//        Above can also be written as
        BiPredicate<Person, Person> comparePerson2 = Person::equals;
        System.out.println(comparePerson1.test(p1, p2));
        System.out.println(comparePerson2.test(p1, p2));

//        Examples with Collections
        List<String> strList = new ArrayList<>();
        strList.add("Kamran");
        strList.add("Adnan");
        strList.add("Zeshan");
        strList.add("Zeshan");
        strList.add("Adnan");

        Function<List<String>, Integer> getListCount1 = list -> list.size();
//        Above can also be written as
        Function<List<String>, Integer> getListCount2 = List::size;
        System.out.println(getListCount1.apply(strList));
        System.out.println(getListCount2.apply(strList));

//        Collection Example for Constructor Calling
//        Remove duplicates from List
        Function<List<String>, Collection<String>> removeDuplicates1 = list -> new HashSet<>(list);
//        Above can also be written as
        Function<List<String>, Collection<String>> removeDuplicates2 = HashSet::new;
//        In above example, calling the constructor method with new
        System.out.println(removeDuplicates1.apply(strList));
        System.out.println(removeDuplicates2.apply(strList));


    }

}

