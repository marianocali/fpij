package main.fpij.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class Generic {



    public static void foo(){
        ArrayList keywords = new ArrayList();
        keywords.add("java");
        keywords.add("certification");
        keywords.add("exam");
        keywords.add(new java.util.Date());

        for(Object x : keywords) {
            String temp = (String) x;
            System.out.println(temp.toUpperCase());
        }

    }

    public static void main(String[] args) {
//        Integer[] intArray = {1, 2, 3, 4, 5};
//        List<Integer> list = fromArrayToList(intArray);
//
//        System.out.println(list);
        foo();
    }

    public static <T> List<T> fromArrayToList(T[] list) {
        return Arrays.stream(list).collect(Collectors.toList());
    }

    public <T> List<T> genericMethod(List<T> list) {
        return list.stream().collect(Collectors.toList());
    }



}
