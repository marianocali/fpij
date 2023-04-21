package main.fpij.cap3.iterating;

public class Ex4FilteringDigits {
    final static String str = "w00t";

    //Filtering digits
    public static void main(String[] args) {
        str.chars()
                .filter(Character::isDigit)
                .forEach(Ex4FilteringDigits::printChar);
    }

    public static void printChar(int aChar){
        System.out.println((char) aChar);
    }

}
