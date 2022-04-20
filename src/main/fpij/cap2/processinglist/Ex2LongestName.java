package main.fpij.cap2.processinglist;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex2LongestName {
    final static List<String> friends = Arrays.asList("Brian","Nate","Neal","Raju","Sara","Scooty");

    public static void main(String[] args) {
//        System.out.println(String.format("longest name in list: %s", pickLongestName()));
        System.out.println("Steve or longest return: " + steveOrLonger());
    }

    public static String pickLongestName(){

        Optional<String> aLongName = friends.stream()
                .reduce((name1, name2)
                        -> name1.length() >= name2.length() ? name1 : name2);
                // aLongName.ifPresent(name->
                   //     System.out.print(String.format("longest name in list: %s", name)));
                return aLongName.orElse("");
    }


    //get the Longest name with a default value: Steve. If there no elements Steve is returned.
    // if there are shorts name steve is returned else the longest name is returned
    public static String steveOrLonger(){
        return friends.stream()
                .reduce("Steve",(name1,name2) ->
                        name1.length() >= name2.length() ? name1: name2);
        //it means reduce between Steve and every String in the list
    }
}
