package main.fpij.cap2.transforminglist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1TransformingOldWay {

    // transform a list of Strings to uppercase
    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("Brian", "Neat", "Neal", "Raju", "Sara", "Scott");



        toUpperV1(friends);
        System.out.println();
        // version 2
        toUpperV2(friends);
    }
    //just printing the name without creating a new list
    public static void toUpperV1(List<String> friends){
        for(String friend : friends){
            System.out.print(friend.toUpperCase() + " ");
        }
    }


    //creating a new list before print
    public static void toUpperV2(List<String> friends){
        final List<String> uppercaseName = new ArrayList<>();
        for(String name : friends){
            uppercaseName.add(name.toUpperCase());
        }
//        uppercaseName.forEach(System.out::println);
        uppercaseName.forEach(name -> System.out.print(name + " "));
    }


}
