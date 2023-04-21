package main.fpij.cap2.findingelements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1OldApproach {

    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("Brian", "Neat", "Neal", "Raju", "Sara", "Scott");
        final List<String> starWithN = new ArrayList<>();

        for(String name :friends){
            if(name.startsWith("N")){
                starWithN.add(name);
            }
        }
        starWithN.forEach( name -> System.out.print(name + " "));
    }
}
