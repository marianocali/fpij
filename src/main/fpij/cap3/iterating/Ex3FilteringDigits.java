package main.fpij.cap3.iterating;

public class Ex3FilteringDigits {

    final static String str = "w00t";

    //Filtering digits
    public static void main(String[] args) {
        str.chars()
                .filter(ch-> Character.isDigit(ch))
                .forEach(ch -> printChar(ch));
    }

    public static void printChar(int aChar){
        System.out.println((char) aChar);
    }

}
