package main.fpij.cap3;

public class Ex1IterateString {

    final static String str = "w00t";
    final static String str2 = "w00t78sg573dgf";

    public static void main(String[] args) {

        //str.chars().forEach(ch -> System.out.println(ch));
//        str.chars().forEach(Ex1IterateString::printChar);

//        printWithStream();
//        filterNumbersFromString();
        filterNumbersFromStringMethodReference();
    }

    public static void printChar(int aChar){
        System.out.println((char) aChar);
    }

    public static void printWithStream(){
        str.chars()
           .mapToObj(ch-> Character.valueOf((char) ch))
           .forEach(System.out::println);
    }

    public static void filterNumbersFromString(){
        str2.chars()
                .filter(ch->Character.isDigit(ch))
                .forEach(ch-> printChar(ch));
    }

    public static void filterNumbersFromStringMethodReference(){
        str.chars()
                .filter(Character::isDigit)
                .forEach(Ex1IterateString::printChar);
    }

//    public static void ErrorExampleCallingMethodAmbiguity(){
//        str.chars()
//                .mapToObj(ch-> String.valueOf(ch))
//                .filter(Double::toString)
//                .forEach();
//    }
}
