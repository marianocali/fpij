package main.fpij.test;

public class LongestWord {


    // get the longest word in a String.
    //Example input: fun&!! timeless proce -> timeless
    //Example input: fun&!! time processing -> processing
    public static void main(String[] args) {
//        String input = "fun&!! timeles proc";
        String input = "I love dogs";
        System.out.println(longestWord(input));
    }
    public static String longestWord(String sen){
        int positionEmpty = sen.indexOf(" ");
        String longestWord = "";
        String rightString = sen;
        while(positionEmpty != -1){
            String leftString = rightString.substring(0,positionEmpty);
            if(longestWord.length() < leftString.length()){
                longestWord = leftString;
            }
            rightString = rightString.substring(positionEmpty+1);
            positionEmpty = rightString.indexOf(" ");

        }
        if(rightString.length() > longestWord.length()){
            longestWord = rightString;
        }
        return longestWord;
    }

    static String longest = "";
    public static String longestWordRecursive(String input){
        if(!input.contains(" ")){
            if(longest.length() > input.length()){
                System.out.println("longest > input");
                return longest;
            }else {
                longest = input;
            }
        }else {
            String leftString = input.substring(0,input.indexOf(" "));
            if(longest.length() < leftString.length()) {
                longest = leftString;
                System.out.println("longest: " + longest);
            }
            longestWord(input.substring(input.indexOf(" ") +1));
        }
        return longest;
    }
}
