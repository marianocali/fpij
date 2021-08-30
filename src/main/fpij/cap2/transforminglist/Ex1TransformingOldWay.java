package main.fpij.cap2.transforminglist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1TransformingOldWay {

    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("Brian", "Neat", "Neal", "Raju", "Sara", "Scott");
        final List<String> uppercaseName = new ArrayList<>();
        for(String name : friends){
            uppercaseName.add(name.toUpperCase());
        }
        uppercaseName.forEach(System.out::println);
    }
}
