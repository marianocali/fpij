package main.fpij.cap2.processinglist;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex1CountTotalLengthOfEveryElement {

    final static List<String> friends = Arrays.asList("Brian","Nate","Neal","Raju","Sara","Scoot");
    final static List<String> myList = Arrays.asList("Zeta, Foo, Fifth, Baz, Bar");

    public static void main(String[] args) {
        countLenghtOfEveryString();
    }

    public static void countLenghtOfEveryString(){
        friends.stream()
                .mapToInt(name->name.length())
                .forEach(name-> System.out.print(name + " "));
    }

}
