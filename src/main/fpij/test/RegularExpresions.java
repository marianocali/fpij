package main.fpij.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegularExpresions {


    public static void main(String[] args) {
//        firstExample();
//        secondExample();
//        System.out.println("number of occurences: " + numberOccurrences("foo", "34r3rfoo34r3fokkfoo434foo"));
//        testRegExp();
//        dotCharacterExample3();
//        orClassExample();
//        NorExamples();
//        rangeLowerCaseExamples();
//        rangeNumericExample3();
//        unionClassExample();

        intersectionClassExample();
    }

    public static void literalExample(){
        Pattern pattern = Pattern.compile("foo");
        Matcher matcher = pattern.matcher("foo");

        if (matcher.matches()) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }

    // find the match count
    public static void secondExample(){
        Pattern pattern = Pattern.compile("foo");
        Matcher matcher = pattern.matcher("foofoo");
        int matches = 0;
        while (matcher.find()) {
            matches++;
        }

        if(matches == 2){
            System.out.println("OK");
        }else {
            System.out.println("ERROR");
        }
    }

    //return number of occurrences of regex in the text given
    public static int numberOccurrences(String regex, String text){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int matches = 0;
        while (matcher.find()) {
            matches++;
        }
        return matches;
    }

    public static void dotCharacterEx1(){
        int matches = numberOccurrences(".", "foo");
        System.out.println("matches: . in foo " + matches);
    }

    public static void dotCharacterExample2(){
        int matches = numberOccurrences("foo.", "foo");
        System.out.println("matches: foo. in foo " + matches);
    }

    public static void dotCharacterExample3(){
        int matches = numberOccurrences("foo.", "foofoo");
        System.out.println("matches: foo. in foofoo " + matches);
    }

    // OR Class Any of the elements in the set is matched:
    public static void orClassExample(){
        String regex = "[abc]";
        String text = "b";
        int matches = numberOccurrences(regex, text);
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);

        regex = "[ac]";
        text = "b";
        matches = numberOccurrences(regex, text);
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);

        regex = "[abc]";
        text = "abcb";
        matches = numberOccurrences(regex, text);
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);

        regex = "[0-9]";
        text = "a4b3c6b";
        matches = numberOccurrences(regex, text);
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);

        regex = "[a-z]";
        text = "a4b3c6f";
        matches = numberOccurrences(regex, text);
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);

        regex = "[A-Z]";
        text = "a4b3c6f";
        matches = numberOccurrences(regex, text);
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);

        regex = "[0-9a-z]";
        text = "a4b3c6f";
        matches = numberOccurrences(regex, text);
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);

        regex = "[0-9A-Z]";
        text = "abc123";
        matches = numberOccurrences(regex, text);
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);

        regex = "[0-9a-zA-Z]";
        text = "abc123PYQ";
        matches = numberOccurrences(regex, text);
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);

        regex = "[0-9a-zA-Z]";
        text = "abc1$2&3-/(";
        matches = numberOccurrences(regex, text);
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);

        regex = "[bcr]at";
        text = "bat cat rat sal";
        matches = numberOccurrences(regex, text);
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);
    }


    public static void NorExamples(){
        String regex = "[^abc]";
        String text = "g";
        int matches = numberOccurrences(regex, text);
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);

        regex = "[^bcr]at";
        text = "sat mat eat bat cat";
        matches = numberOccurrences(regex, text);
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);
    }

    // RANGE Class
    public static void rangeUppercaseExample(){
        String regex = "[A-Z]";
        String text = "Two Uppercase alphabets 34 overall";
        int matches = numberOccurrences(regex, text);
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);
    }

    public static void rangeLowerCaseExamples(){
        String regex = "[a-z]";
        String text = "Two Uppercase alphabets 34 overall";
        int matches = numberOccurrences(regex, text);
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);
    }

    public static void rangeNumericExample(){
        String regex = "[0-9]";
        String text = "ab5c07yu(w3";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int matches = 0;
        while(matcher.find()){
            matches++;
        }
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);
    }

    public static void rangeNumericExample2(){
        String regex = "[0-5]";
        String text = "ab5c07yu(w3";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int matches = 0;
        while(matcher.find()){
            matches++;
        }
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);
    }

    public static void rangeNumericExample3() {
        String regex = "3[0-5]";
        String text = "ab5c07yu(w3";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int matches = 0;
        while (matcher.find()) {
            matches++;
        }
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);
    }

    public static void rangeNumericExample4(){
        String regex = "3[0-5]";
        String text = "Two Uppercase alphabets 34 overall";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int matches = 0;
        while(matcher.find()){
            matches++;
        }
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);
    }


    // UNION Class
    //The test will only match 6 out of the 9 integers because the union set skips 4, 5, and 6.
    public static void unionClassExample(){
        String regex = "[1-3[7-9]]";
//        String regex = "[1-7-9]"; // 1 to 7 and 9 not 8

        String text = "123456789";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int matches = 0;
        System.out.print("matches: ");
        while(matcher.find()){
            for (int i = 0; i <= matcher.groupCount(); i++) {
                System.out.print(matcher.group(i) + " ");
            }
            matches++;
        }
        System.out.println();
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);
    }

    //INTERSECTION Class
    public static void intersectionClassExample(){
        String regex = "[1-6&&[3-9]]";
        String text = "123456789";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int matches = 0;
        while(matcher.find()){
            matches++;
        }
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);
    }


    // *	Coincidir con el carácter o subexpresión anterior 0 o más veces
    // +	Coincidir con el carácter o subexpresión anterior 1 o más veces
    // ?	Coincidir con el carácter o subexpresión anterior 0 o 1 veces
    // ?	Coincidir con el carácter o subexpresión anterior 0 o 1 veces
    public static void testRegExp(){

        Pattern pat = Pattern.compile("[^[A-Za-z0-9_]+$/g]");       //contiene solo letras minúsculas o mayúsculas
        Matcher mat = pat.matcher("OSheaPeter_");

        if (mat.matches()) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
/*
    public static void testPhoneNumber(){
        Pattern phonePattern = Pattern.compile("(\\d{3})-(\\d{3})-(\\d{4})");
        Matcher phoneMatcher = phonePattern.matcher("abcd800-555-1234wxyz");

        String number = phoneMatcher.group(0); //"800-555-1234" (Group 0 is everything the regex matched)
        String aCode = phoneMatcher.group(1); //"800"
        String threeDigit = phoneMatcher.group(2); //"555"
        String fourDigit = phoneMatcher.group(3); //"1234"
        phoneMatcher.find();
        String areaCode = phoneMatcher.group("AreaCode"); //"800"

        System.out.println("number: " + number);
        System.out.println("aCode: " + aCode);
        System.out.println("threeDigit: " + threeDigit);
        System.out.println("fourDigit: " + fourDigit);
        System.out.println("areaCode: " + areaCode);
    }
    */

}
