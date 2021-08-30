package main.fpij.cap2.findingelements;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex6PickDifferentNames {

    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("Brian", "Neat", "Neal", "Raju", "Sara", "Scott");
        final List<String> comrades = Arrays.asList("Kate", "Ken", "Nick", "Paula", "Zach");
        final List<String> editors = Arrays.asList("Brian", "Jackie", "John", "Mike");

        final long countFriendsStartN = friends.stream().filter(checkIfStartWith("N")).count();
        final long countFriendsStartB = friends.stream().filter(checkIfStartWith("B")).count();

        final long countComradesStartN = comrades.stream().filter(checkIfStartWith("N")).count();
        final long countComradesStartB = comrades.stream().filter(checkIfStartWith("B")).count();

        final long countEditorsStartN = editors.stream().filter(checkIfStartWith("N")).count();
        final long countEditorsStartB = editors.stream().filter(checkIfStartWith("B")).count();

        System.out.println("countFriendsStartN: " + countFriendsStartN + "\n" +
                "countFriendsStartB: " + countFriendsStartB + "\n" +
                "countComradesStartN: " + countComradesStartN + "\n" +
                "countComradesStartB: " + countComradesStartB + "\n" +
                "countEditorsStartN: " + countEditorsStartN + "\n" +
                "countEditorsStartB: " + countEditorsStartB);
    }

    public static Predicate<String> checkIfStartWith(final String letter){
        return name -> name.startsWith(letter);
    }
}
