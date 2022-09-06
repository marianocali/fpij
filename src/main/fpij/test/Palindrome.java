package main.fpij.test;

public class Palindrome {


    //given a palindrome String change it to the minimum String not palindrome
    // given aabaa -> babaa
    // given zbcbz  -> zccbz
    public static void main(String[] args) {
//        System.out.println(palindrome("never odd or even"));
        alphabet();
    }

    public static void changePalindrome(String input) {
        String palindrome = "aaabbaaa";
        char c;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < palindrome.length() / 2; i++) {
            for (c = 'a'; c <= 'z'; ++c) {
                if (c < palindrome.charAt(i)) {
                    sb = new StringBuilder(palindrome);
                    sb.setCharAt(i, c);
                }
            }
        }
        System.out.println("new String : \n" + sb.toString());
    }

    //print alphabet
    public static void alphabet() {
        char c;
        for (c = 'A'; c <= 'Y'; c++) {
            System.out.print(c + ", ");
        }
        System.out.print('Z');
    }

    public static boolean palindrome(String input) {
        System.out.println("input  " + input);
        String cleanInput = input.replaceAll("\\s+", "");
        System.out.println(cleanInput);
//        Boolean isPalindrome = Boolean.TRUE;
        for (int i = 0; i < cleanInput.length() / 2; i++) {
            if (cleanInput.charAt(i) != cleanInput.charAt(cleanInput.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
