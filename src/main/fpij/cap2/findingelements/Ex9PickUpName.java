package main.fpij.cap2.findingelements;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex9PickUpName {

    final static List<String> friends = Arrays.asList("Brian","Nate","Neal","Raju","Sara","Scoot");

    public static void main(String[] args) {
        pickName("N");
        pickName("Z");
    }


    public static void pickName(final String letter){
        Optional friendFound =
                friends.stream()
                        .filter(name -> name.startsWith(letter))
                        .findFirst();

        System.out.println("The first name found with letter " + letter + " is " + friendFound.orElse("no friend found"));

//        System.out.println(String.format("The first name found with letter %s %s %s ", letter , " is " , friendFound.orElse("no friend found")));

    }













//    public static void pickName(final String startingLetter){
//        Optional<String> foundName = friends
//                .parallelStream()
//                .filter(name -> name.startsWith(startingLetter))
//                .findFirst();
//        System.out.println(String.format("first name in the list starting with %s: %s", startingLetter, foundName.orElse("no name found")));
//
//    }
}
