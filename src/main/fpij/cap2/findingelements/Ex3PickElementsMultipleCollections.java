package main.fpij.cap2.findingelements;

import java.util.Arrays;
import java.util.List;

public class Ex3PickElementsMultipleCollections {

    public static void main(String[] args) {

        final List<String> friends = Arrays.asList("Brian", "Neat", "Neal", "Raju", "Sara", "Scott");
        final List<String> comrades = Arrays.asList("Kate", "Ken", "Nick", "Naula", "Zach");
        final List<String> editors = Arrays.asList("Brian", "Jackie", "John", "Mike");

        final long countFriendsStartN =
                friends.stream().filter(name -> name.startsWith("N")).count();

        final long countComradesStartN =
                comrades.stream().filter(name -> name.startsWith("N")).count();

        final long countEditorsStartN =
                editors.stream().filter(name -> name.startsWith("N")).count();

        System.out.println("countFriendsStartN: " + countFriendsStartN + "\n"+
                "countComradesStartN: " + countComradesStartN + "\n"+
                "countEditorsStartN: " + countEditorsStartN);

    }
}
