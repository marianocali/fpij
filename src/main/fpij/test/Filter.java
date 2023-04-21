package main.fpij.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filter {

    final static List<String> friends = Arrays.asList("Brian","Nate","Neal","Raju","Sara","Scoot");

    public static void main(String[] args) {
//        friends.stream().forEach(System.out::println);
//        toUpper();
//        toUpperFilterStartWithNCount();
//        System.out.println(startWithN());
//        System.out.println(String.format("Found %d names with N", startWithN().size()));

//        System.out.println(getListOfLength());
//        System.out.println(getTotalCharacterOfListStrings());

//        System.out.println(String.format("elements started with B %d ", countElementsStartingWithB()));
//        System.out.println(String.format("elements started with N %d ", countElementsStartingWithN()));

//        getArrayWithStringLength().forEach(System.out::println);
//        System.out.println(mapToIntExample1());
        System.out.println(String.format("total characters in Array %d",  countStringFromArray()));

    }

    public static void toUpper(){
        //version 1
//        friends.parallelStream()
//                .forEach(elem-> System.out.println(elem.toUpperCase()));

//        version 2
        friends.parallelStream()
                .map(name->name.toUpperCase())
                .filter(name-> name.startsWith("N"))
                .forEach(name ->System.out.print(name + " "));
    }

    //count lenght of any elem starting with N
    public static void toUpperFilterStartWithNCount(){
        friends.parallelStream()
                .map(name->name.toUpperCase())
                .filter(name-> name.startsWith("N"))
                .map(name-> name.length())
                .forEach(name ->System.out.print(name + " "));
    }

    //pick names starting with N
    public static List<String> startWithN(){
        return friends.parallelStream()
                .filter(name-> name.startsWith("N"))
                .collect(Collectors.toList());
    }

    //pick names starting with N
    public static Long countStartWithN(){
        return friends.parallelStream()
                .filter(name-> name.startsWith("N"))
                .collect(Collectors.counting());
    }

    //return a list with the length of a list of strings
    public static List<Integer> getListOfLength(){

        return friends
                .stream()
                .map(elem -> elem.length())
                .collect(Collectors.toList());
    }

    //get total of characters in a list of Strings
    public static Integer getTotalCharacterOfListStrings(){

        return Math.toIntExact(friends
                .stream()
                .map(elem -> elem.length())
                .count());
    }



    public static java.util.stream.IntStream getArrayWithStringLength(){

         return friends.parallelStream()
                .mapToInt(String::length);
               // .forEach(System.out::println);
    }

    public static Integer countStringFromArray(){
        return friends
                .parallelStream()
                .mapToInt(String::length)
                .sum();
    }


}
