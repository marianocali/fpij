package main.fpij.cap2.processinglist;

import java.util.Arrays;
import java.util.List;

public class Ex8GetLongestNameGreaterThanOneGiven {

    //we want to get the longest element of a list but that is greater than one given name.
    //In the example the given name is Steve

    final static List<String> friends = Arrays.asList("Brian","Nate","Neal","Raju","Sara","Scott");
    final static String givenName = "Steve";

    public static void main(String args[]){
        System.out.println("The longest element greater than Steve is: " + longestNameGreaterThanGiven(givenName));
    }

    public static String longestNameGreaterThanGiven(String givenName){
        return friends.stream()
                .reduce(givenName, (name1, name2) ->
                name1.length() >= name2.length() ? name1 : name2);
    }
}
