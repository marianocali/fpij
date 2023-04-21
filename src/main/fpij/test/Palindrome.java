package main.fpij.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

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
        for (int i = 0; i < cleanInput.length() / 2; i++) {
            if (cleanInput.charAt(i) != cleanInput.charAt(cleanInput.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    /**
     * dada una lista de String retornar una lista con todas las palabras que sean palindromos. Un palindromo es una palabra que se escribe
     * con los mismos caracteres que otra. Ej: redraw y drawer. cats y acts.
     * La respuesta tendra la palabra con sus caracteres ordenados alfabeticamente y todos los palíndromos de esta
     *
     *      input = ['cats', 'redraw', 'tap', 'dog', 'pat', 'acts', 'drawer',
     *       'remote', 'reward', 'god']
     *
     *      Output = {
     *        {'cats', 'acts'},
     *         {'redraw', 'drawer', 'reward'},
     *         {'tap','pat'},
     *         {'dog','god'},
     *         {'remote'}
     *      }
     *
     */
        /*
    // input = ['cats', 'redraw', 'tap', 'dog', 'pat', 'acts', 'drawer',
    //  'remote', 'reward', 'god']

    // Output = {
    //   {'cats', 'acts'},
    //    {'redraw', 'drawer', 'reward'},
    //    {'tap','pat'},
    //    {'dog','god'},
    //    {'remote'}
    // }
     */
    public static void palindromos(){

        List<String> input = List.of("cats", "redraw", "tap", "dog", "pat", "acts", "drawer","remote", "reward", "god");
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String elem : input){
            char[] ch = elem.toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);
            map.put(str,new ArrayList<>());
        }
        for(String elem:input){
            char[] ch = elem.toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);
            if(map.containsKey(str)){
                map.get(str).add(elem);
            }
        }
        map.forEach((k,v) -> System.out.println("Key: " + k + ": Value: " + v));
    }

}
