package main.fpij.cap3.iterating;

public class Ex1IterateString {

    final static String str = "abcdABC";

    //Print the code of every character in the String a 97 b 98 c 99 A 65 B 66
    public static void main(String[] args) {
        str.chars().forEach(System.out::println);
    }
}
