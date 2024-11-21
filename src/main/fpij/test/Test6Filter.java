package main.fpij.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test6Filter {

    public static void main(String[] args) {
        List<String> alarms = Arrays.asList("a", "b", "c","d");
        List<String> devices = Arrays.asList("c","d");

        List<String> alarmsFiltered = alarms.stream()
            .filter(alarm -> devices.contains(alarm))
            .collect(Collectors.toList());

        System.out.println("alarmsFiltered:" + alarmsFiltered);
    }
}
