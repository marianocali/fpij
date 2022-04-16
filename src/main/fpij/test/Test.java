package main.fpij.test;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Test {



    public static void main(String[] args) {
//        readData();
        testRegExp();
//        palindromos();

    }

    public static void readData(){
        String fileName = "src/main/fpij/test/coding-test-data.txt";

        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            Pattern pattern = Pattern.compile("...");
            Pattern pat = Pattern.compile("[a-zA-Z].*");
            stream
//                    .filter(name -> name.startsWith("N") ||  name.startsWith("B")).
                    .filter(pat.asPredicate())
                    .forEach(System.out::println);


        } catch (IOException e) {
            e.printStackTrace();
        }
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

    private static void testRegExp(){

//        Pattern pat = Pattern.compile("abc");             //exactamente el patrón (matches) “abc”
//        Pattern pat = Pattern.compile(".*abc.*");         //contiene “abc”  fabcd si afbcd no
//        Pattern pat = Pattern.compile("^abc.*");          //empieza por abc
//        Pattern pat = Pattern.compile("^[aA]bc.*");       //empieza por “abc” ó “Abc”
//        Pattern pat = Pattern.compile("[a-zA-Z]{5,10}");  //formado por un mínimo de 5 letras mayúsculas o minúsculas y un máximo de 10
//        Pattern pat = Pattern.compile("[\\d]*");          //contiene solo dígitos
//        Pattern pat = Pattern.compile("[a-zA-Z]*");       //contiene solo letras minúsculas o mayúsculas
//        Pattern pat = Pattern.compile("^[^\\d].*");       //no empieza por un dígito
//        Pattern pat = Pattern.compile(".*[^\\d]$");       //no acaba en digito
//        Pattern pat = Pattern.compile("(a|b)+");          //solo contienen los caracteres a ó b
//        Pattern pat = Pattern.compile(".*1(?!2).*");      //el primer 1 no está seguido por un 2
        Pattern pat = Pattern.compile("[a-zA-Z]*[,]");       //contiene solo letras minúsculas o mayúsculas

        Matcher mat = pat.matcher("a1bbb212abaa12");

        if (mat.matches()) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}