package main.fpij.cap3.iterating;

public class Ex2IterateStringPrinting {

    final static String str = "w00t";
    //Print every character in the String
    public static void main(String[] args) {
        str.chars().forEach(a -> System.out.println((char) a ));
    }
}
