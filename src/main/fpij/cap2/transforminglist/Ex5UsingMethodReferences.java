package main.fpij.cap2.transforminglist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ex5UsingMethodReferences {

    public static void main(String[] args) {

        final List<String> friends = Arrays.asList("Brian", "Neat", "Neal", "Raju", "Sara", "Scott");
//        final List<String> friendsU= new ArrayList<>();
//        friends.forEach(name -> friendsU.add(name.toUpperCase()));
//        System.out.print(friendsU);

        friends.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList())
                .forEach(name -> System.out.println(name));

//        System.out.println("friends: " + friends);


//        friends.stream()
//        .map(String::toUpperCase)
//        .forEach(name -> System.out.print(name + " "));

    }
}
