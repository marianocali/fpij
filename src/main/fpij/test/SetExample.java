package main.fpij.test;

import java.util.HashSet;
import java.util.Set;

public class SetExample {


    private static Set<Integer> setA = Set.of(1,2,3,4);
    private static Set<Integer> setB = Set.of(2,4,6,8);

    public static void main(String args[]){
        intersection();
    }

    private static Set<Integer> intersection(){

        Set<Integer> intersectSet = new HashSet<>(setA);
        intersectSet.retainAll(setB);
        intersectSet.stream()
                .forEach(System.out::println);
        return  intersectSet;
    }

    public static Set<Integer> union(){
        Set<Integer> unionSet = new HashSet<>(setA);
        unionSet.addAll(setB);
        unionSet.stream()
                .forEach(System.out::println);
        return unionSet;
    }

    public static Set<Integer> complement(){
        Set<Integer> differenceSet = new HashSet<>(setA);
        differenceSet.removeAll(setB);
        differenceSet.stream()
                .forEach(System.out::println);
        return differenceSet;
    }
}
