package main.fpij.cap3.comparator;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex10NameOfPeopleByAge {

    final static List<Person> people = Arrays.asList(
            new Person("John", 20),
            new Person("Sara", 21),
            new Person("Jane", 21),
            new Person("Greg", 35));

    //group people name by their age showing the age and all person with that age


    public static void groupingByAge(){
        people.stream()
                .collect(Collectors.groupingBy(Person::getAge))
                .forEach((age, people1) -> System.out.println(age + ": " + people1));
    }

    public static void groupingByAgeShowingOnlyName(){
        Map<Integer,List<String>> nameOfPeopleByAge =
        people.stream()
                .collect(Collectors.groupingBy(Person::getAge, Collectors.mapping(Person::getName, Collectors.toList())));
        System.out.printf("Names of people grouped by their ages: " + nameOfPeopleByAge);
    }


    public static void main(String[] args) {
        groupingByAge();
        groupingByAgeShowingOnlyName();
    }

}
