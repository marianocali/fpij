package main.fpij.test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {


    static Set<String> treeSet = new TreeSet<>();
    static Set<String> treeSet2 = new TreeSet<>(Comparator.comparing(String::length));

    public static void main(String[] args) {
        System.out.println(addElementToSet());
    }

    public static boolean addElementToSet(){
        return treeSet.add("String Added");
    }

}
