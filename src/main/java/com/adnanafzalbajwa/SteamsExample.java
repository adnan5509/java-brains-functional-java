package com.adnanafzalbajwa;

import enums.CountryInfo;
import models.Person;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteamsExample {

    public static void main(String[] args) throws IOException, URISyntaxException {
        List<String> brothers = Arrays.asList("Zeshan", "Adnan", "Kamran");
        Stream<String> stream = brothers.stream();
        stream.forEach(System.out::println);

        Stream.of("Noor", "Adnan").forEach(System.out::println);

        System.out.println("-----------------------------------");

        Path filePath = Paths.get(ClassLoader.getSystemResource("streamsExampleFile").toURI());
        Stream<String> fileLinesStream = Files.lines(filePath);
        fileLinesStream.forEach(System.out::println);

        System.out.println("-----------------------------------");

        Stream.generate(new Random()::nextDouble).limit(10).forEach(System.out::println);

        System.out.println("-----------------------------------");

        Stream.iterate("Adnan Afzal", str -> str.concat(" Bajwa")).limit(5).forEach(System.out::println);

        System.out.println("-----------------------------------");

//        Create Even numbers upto 50 and get them in a list and then print the list element using
        List<Integer> evenNums = Stream.iterate(0, x -> x + 2).limit(26).collect(Collectors.toList());

        evenNums.stream().forEach(System.out::println);

        System.out.println("-----------------------------------");

//        limit
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).limit(5).forEach(System.out::println);

        System.out.println("-----------------------------------");

//        filter (get only even numbers)
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(x -> x % 2 == 0).forEach(System.out::println);

        System.out.println("-----------------------------------");

//        filter (get only even numbers) and limit together
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(x -> x % 2 == 0).limit(3).forEach(System.out::println);

        System.out.println("-----------------------------------");

//        Using CountryInfo enum to use Streams operations

//        Get Europe Countries
        Arrays.stream(CountryInfo.values()).filter(countryInfo -> countryInfo.getContinent().equalsIgnoreCase("europe")).map(countryInfo -> countryInfo.getCountryName()).forEach(System.out::println);

        System.out.println("-----------------------------------");

//        Get first two Asian Countries
        Arrays.stream(CountryInfo.values()).filter(countryInfo -> countryInfo.getContinent().equalsIgnoreCase("asia")).limit(2).map(countryInfo -> countryInfo.getCountryName()).forEach(System.out::println);

        System.out.println("-----------------------------------");

//        Get countries with euro currency and filter them by the name starting with L but peek before filtering
        Arrays.stream(CountryInfo.values()).filter(countryInfo -> countryInfo.getCurrency().equalsIgnoreCase("euro")).peek(countryInfo -> System.out.println("Peeking: " + countryInfo.getCountryName())).filter(countryInfo -> countryInfo.getCountryName().startsWith("L")).forEach(System.out::println);

        System.out.println("-----------------------------------");

//        Get distinct currencies of the countries
        Arrays.stream(CountryInfo.values()).map(countryInfo -> countryInfo.getCurrency()).distinct().forEach(System.out::println);

        System.out.println("-----------------------------------");

//        Get sorted list of countries name
        Arrays.stream(CountryInfo.values()).map(countryInfo -> countryInfo.getCountryName()).sorted().forEach(System.out::println);

        System.out.println("-----------------------------------");

//      Countries with their capitals together and print them
        Arrays.stream(CountryInfo.values()).flatMap(countryInfo -> Stream.of(countryInfo.getCountryName(), countryInfo.getCapital())).forEach(System.out::println);

        System.out.println("-----------------------------------");

//      Concat two streams
        Stream<String> countriesNameStream = Arrays.stream(CountryInfo.values()).map(countryInfo -> countryInfo.getCountryName());
        Stream<String> capitalsNameStream = Arrays.stream(CountryInfo.values()).map(countryInfo -> countryInfo.getCapital());

        Stream.concat(countriesNameStream, capitalsNameStream).forEach(System.out::println);

        System.out.println("-----------------------------------");

//        Using Streams with Objects
        List<Person> personList = Arrays.asList(new Person("Zeshan", 33), new Person("Adnan", 31), new Person("Kamran", 27), new Person("Noor", 27), new Person("M Afzal Bajwa", 67), new Person("Riaz Begum", 57), new Person("Maria", 30));

        personList.stream().filter(person -> person.getAge() > 30).map(person -> person.getName()).forEach(System.out::println);
    }


}
