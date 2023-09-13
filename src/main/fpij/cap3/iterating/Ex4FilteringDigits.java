package main.fpij.cap3.iterating;

public class Ex4FilteringDigits {
    final static String str = "w00t";

    //Filtering digits
    public static void main(String[] args) {
        str.chars()
                .filter(c-> !Character.isDigit(c))
                .forEach(Ex4FilteringDigits::printChar);
//                .forEach(ch-> System.out.println((char) ch));
    }

    public static void printChar(int aChar){
        System.out.println((char) aChar);
    }

}
