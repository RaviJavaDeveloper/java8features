package org.ravi;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.*;

public class Lambdas {

    public static void main(String[] args) {
//        ZoneId.getAvailableZoneIds().forEach(id -> {
//            System.out.println(id);
//        });
//Note : If lambda implementation contains one statement, return type not required
        // Wish wish = (LocalTime time) -> {
        Wish wish = time -> {
            int hour = time.getHour();
            if (hour > 7 && hour < 12) {
                return "Good Morning";
            } else if (hour >= 12 && hour < 16) {
                return "Good Afternoon";
            } else if (hour >= 16 && hour < 20) {
                return "Good evening";
            } else if (hour >= 20) {
                return "Good night";
            } else {
                return "Invalid time";
            }
        };
        System.out.println("\n-------------Wish message--------------");
        System.out.println(wish.wish(LocalTime.now(ZoneId.of("Europe/Volgograd"))));


        //For each loop
        List<String> wordList = Arrays.asList("Ravi", "Kumar", "is", "Java", "Developer");
        final StringBuilder builder = new StringBuilder();
        wordList.forEach(word -> builder.append(word).append(" "));

        System.out.println("\n-------------Concated words--------------");
        System.out.println(builder);


        //Lambda with comparator
        List<User> users = UsersListFactory.getList();
        //Collections.sort(users, Comparator.comparing(User::getName));
        System.out.println("\n-------------Ordered Users--------------");
        users.sort((u1, u2) -> u1.getName().compareToIgnoreCase(u2.getName()));
        users.forEach(System.out::println);


        //Lambda with filter
        System.out.println("\n-------------Filtered Users--------------");
        users.stream().filter(u1 -> u1.getSalary() < 20000)
                .forEach(System.out::println);
    }
}

@FunctionalInterface
interface Wish {
    String wish(LocalTime time);
}

