package main.fpij.cap3.comparator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex12PrintOnlyNames {

    final static List<Person> people = Arrays.asList(
            new Person("John", 20),
            new Person("Sara", 21),
            new Person("Jane", 21),
            new Person("Greg", 35));


    /*public static void main(String... args) {
        BigDecimal a = new BigDecimal(5);
        BigDecimal b = new BigDecimal(3);
        BigDecimal result = a.divide(b, 2, RoundingMode.HALF_UP);
        System.out.println(result);

    }
    */

    public static void main(String[] args) {
        List<String> namesOfPeople = people.stream()
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println(namesOfPeople);
//        filteringExample();
    }



    public static void filteringExample(){
        people.stream()
                .filter(person -> person.getName().startsWith("J"))
                .filter(person -> person.getAge() > 25)
                .forEach(System.out::println);
    }


}
