package com.pluralsight.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = List.of(
                new Person("Pinar", "Durmaz", 53),
                new Person("Umut", "Tikbas", 20),
                new Person("Berkcan", "Emre", 30),
                new Person("Vilayat", "Brown", 21),
                new Person("Maksim", "Davis", 35),
                new Person("Andrei", "Garcia", 18),
                new Person("Moni", "Martinez", 21),
                new Person("Enes", "Lopez", 33)
        );

        System.out.print("Enter a name to search (first or last): ");
        String search = scanner.nextLine().toLowerCase();

        List<Person> matchedPeople = people.stream()
                .filter(p -> p.getFirstName().equalsIgnoreCase(search) || p.getLastName().equalsIgnoreCase(search))
                .collect(Collectors.toList());

        if (matchedPeople.isEmpty()) {
            System.out.println("No matches found.");
        } else {
            System.out.println("Matches found:");
            matchedPeople.forEach(System.out::println);
        }

        double averageAge = people.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);

        int maxAge = people.stream()
                .mapToInt(Person::getAge)
                .max()
                .orElse(0);

        int minAge = people.stream()
                .mapToInt(Person::getAge)
                .min()
                .orElse(0);

        System.out.printf("Average age: %.2f\n", averageAge);
        System.out.println("Oldest age: " + maxAge);
        System.out.println("Youngest age: " + minAge);

    }
}
