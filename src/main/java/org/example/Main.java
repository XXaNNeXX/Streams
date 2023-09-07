package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> myIntList = new ArrayList<>();
        myIntList.add(1);
        myIntList.add(7);
        myIntList.add(3);
        myIntList.add(4);
        myIntList.add(10);
        myIntList.add(6);
        myIntList.add(2);
        myIntList.add(8);
        myIntList.add(9);
        myIntList.add(5);

        myIntList.stream()
                .filter(number -> number % 2 == 0)
                .forEach(number -> System.out.println(number));      //lambda: .forEach(System.out::println)

        System.out.println("----------------------------------------");

        myIntList.stream()
                .map(number -> number*2)
                .forEach(number -> System.out.println(number));      //lambda: .forEach(System.out::println)

        System.out.println("----------------------------------------");

        myIntList.stream()
                .sorted()
                .forEach(number -> System.out.println(number));

        System.out.println("----------------------------------------");

        System.out.println("sum: " + myIntList.stream()
                                    .reduce(0, (a,b) -> a + b));    //lambda: .reduce(0, Integer::sum);

        System.out.println("----------------------------------------");

        System.out.println(myIntList.stream()
                                    .filter(number -> number % 2 == 0)
                                    .map(number -> number*2)
                                    .sorted()
                                    .collect(Collectors.toList()));
    }
}