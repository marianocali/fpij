package main.fpij.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Prueba1 {

    static List<String> names = Arrays.asList("Raju", "Nate", "Neal", "Brian", "Sarajeo","Scott");
    List<String> comrades = Arrays.asList("Kate", "Ken", "Nick", "Paula", "Zach");
    List<String> editors = Arrays.asList("Brian", "Jackie", "John", "Mick");


    public static void main(String[] args) {
        Prueba1 prueba1 = new Prueba1();
        prueba1.getStartWithLetter("N");

        prueba1.getStartWithLetter2("S");
        System.out.println("total characters: " + totalCharacters());
        System.out.println("longName: " + longName());
        System.out.println("stringJoinerExample: " + stringJoinerExample());

    }

    public static void initialMetod(){
        List<Float> elems = Arrays.asList(2.5f, 35f,20f,15f,323f);


//        names.stream()
//                .map(elem-> elem.toUpperCase())
//                .forEach(System.out::println);

        //contar lo que mide cada String
//        names.stream()
//                .mapToInt(elem->elem.length())
//                .forEach(elem -> System.out.print(elem + " "));
        //start with N
//        elems.stream()
//                .filter(elem-> elem > 20f)
//                .mapToDouble(elem-> elem + elem * 0.9)
//                .forEach(elem-> System.out.print(elem + " "));

        //start with N
//        names = names.stream()
//                .filter(name -> name.startsWith("N"))
//                .collect(Collectors.toList());
//
//        System.out.print("total names with N: " + names.size());

        //create predidate to get elems starting with N
//        Predicate<String> startWithN = name -> name.startsWith("N");

//        System.out.println("names starting With N: " + names.stream().filter(startWithN).collect(Collectors.toList()));
//        System.out.println("comrades starting with N: " + comrades.stream().filter(startWithN).collect(Collectors.toList()));
//        System.out.println("editors starting with N: " + editors.stream().filter(startWithN).collect(Collectors.toList()));

    }

    public static Predicate<String> checkStartWith(String letter){
        return name-> name.startsWith(letter);
    }

    public void getStartWithLetter(String letter){

        System.out.println("getStartWithLetter: "  + letter );
        List<String> names = Arrays.asList("Raju", "Nate", "Neal", "Brian", "Sara","Scott");
        names.stream()
                .filter(checkStartWith(letter))
                .forEach(System.out::println);
    }


    public void getStartWithLetter2(String someLetter){

        final Function<String, Predicate<String>> startWithSomeLetter =
                (String letter) ->  name -> name.startsWith(letter);

        final Function<String, Predicate<String>>  startWithLetter =
                letter -> name -> name.startsWith(letter);

        System.out.println("getStartWithLetter2: "  + someLetter );
        List<String> names = Arrays.asList("Raju", "Nate", "Neal", "Brian", "Sara","Scott");
        names = names.stream()
                .filter(startWithSomeLetter.apply(someLetter))
                .collect(Collectors.toList());

        System.out.println(names);

    }

    public static int totalCharacters(){
        return names.stream()
                .mapToInt(name -> name.length())
                .sum();
    }

    public static String longName(){
        Optional<String> longName =
                names.stream()
                        .reduce((name1, name2)-> name1.length()> name2.length()? name1 : name2);

        return longName.isPresent()? longName.get(): " no hay ";
    }

    public static String stringJoinerExample(){

        return String.join(": ", names);
    }

}
