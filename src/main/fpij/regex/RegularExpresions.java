package main.fpij.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegularExpresions {


    public static void main(String[] args) {

        predefinedCharacterLetterOrNumber();
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



    // RANGE Class

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
    // this class results from picking common elements between two or more sets.
    // To apply intersection, we use the &&:
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

    // SUBSTRACCTION Class
    public static void subtractionClassExample(){
        String regex = "[0-9&&[^2468]]";
        String text = "123456789";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int matches =0;
        System.out.print("matches: ");
        while(matcher.find()){
            for(int i = 0; i <= matcher.groupCount(); i++){
                System.out.print(matcher.group(i) + " ");
            }
            matches++;
        }
        System.out.println();
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);
    }

    // PREDEFINED Character Classes
    // \d -> digit equivalent to [0-9]: We have to use \ to escape, the leading backslash must be escaped i.e. \d becomes \\d.
    public static void predefinedCharacterDigit(){
        String regex = "\\d";
        String text = "123";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int matches = 0;
        while(matcher.find()){
            matches++;
        }
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);
    }

    // Matching non-digits, equivalent to [^0-9]:
    public static void predefinedCharacterNonDigit(){
        String regex = "\\D";
        String text= "a6c";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int matches = 0;
        while(matcher.find()){
            matches++;
        }
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);
    }

    // Matching white space:
    public static void predefinedCharacterWhiteSpace(){
        String regex = "\\s";
        String text= "a c";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int matches = 0;
        while(matcher.find()){
            matches++;
        }
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);
    }

    // Matching non-white space:
    public static void predefinedCharacterNonWhiteSpace(){
        String regex = "\\S";
        String text= "a c";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int matches = 0;
        while(matcher.find()){
            matches++;
        }
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);
    }

    // Matching a word character, equivalent to [a-zA-Z_0-9]:
    public static void predefinedCharacterLetterOrNumber(){
        String regex = "\\w";
        String text = "hi!";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int matches = 0;
        while (matcher.find()){
            matches++;
        }
        System.out.println("regex: " + regex + " in text " + text + ": " + matches);
    }

    // Matching a non-word character:
    public static void predefinedCharacterNonWord(){
        String regex = "\\W";
        String text = "hi!";

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
