package main.fpij.cap2;

import main.fpij.cap3.comparator.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Cap2 {
    final static List<String> friends = Arrays.asList("Brian", "Neat", "Neal", "Raju", "Sara", "Scott");

    public static void lengths(){
        friends.stream()
                .map(name -> name.length())
                .forEach(count -> System.out.print(count + " "));
    }

    public static void nameMoreLengths(){
        friends.stream()
                .forEach(name -> System.out.println(name + ": " + name.length()));
    }

    public static void sumLengthOfAllElements(){
        System.out.print(friends.stream()
                .mapToInt(elem -> elem.length())
                .sum());

    }

    public static void namesWithN(){
        System.out.println("\n names starting with N");
        friends.stream()
                .filter(name-> name.startsWith("N"))
                .collect(Collectors.toList())
                .forEach(name -> System.out.print(name + " "));
    }

    public static void startingWithN(){
        final Predicate<String> startingWithN = name-> name.startsWith("N");

        friends.stream()
                .filter(startingWithN)
                .collect(Collectors.toList())
                .forEach(name -> System.out.print(name + " "));
    }

    final Function<String, Predicate<String>> startiWithLetter =
            (String letter) -> {
            Predicate<String> checkStartWith =
                    (String name) -> name.startsWith(letter);
                    return checkStartWith;
            };

    final static Function<String, Predicate<String>> startWithLetter =
            letter -> (String name) -> name.startsWith(letter);
    public static void startWithSomeLetter(){
        String letterB = "B";
        String letterN = "N";
        System.out.print("friends starting with " + letterB + " " +
                friends.stream()
                        .filter(startWithLetter.apply(letterB))
                        .collect(Collectors.toList())
                );

        System.out.print("\nfriends starting with " + letterN + " " +
                friends.stream()
                        .filter(startWithLetter.apply(letterN))
                        .collect(Collectors.toList())
        );
    }

    public static void countFriendsStartingWithLetter(){
        String letterB = "B";
        String letterN = "N";
        System.out.print("# friends starting with " + letterB + ": " +
                friends.stream()
                        .filter(startWithLetter.apply(letterB))
                        .count()
                );

        System.out.print("\n# frineds starting with letter " + letterN + ": " +
                friends.stream()
                        .filter(startWithLetter.apply(letterN))
                        .count()
        );
    }

    //get the first name from a list that start with startingLetter
    public static void pickName(final List<String>names , String startingLetter){

        final Optional<String> foundName = names.stream()
                .filter(name-> name.startsWith(startingLetter))
                .findFirst();
        foundName.ifPresent(name-> System.out.println("First name with " + startingLetter + " is: " + name));

//        System.out.print(String.format("First name starting with %s: %s",
//                startingLetter, foundName.orElse("No name found with " + startingLetter)));
        System.out.println("");
    }

    public static void gettingNames() {
        pickName(friends,"N");
        pickName(friends,"X");
    }

    public static void totalNumberOfCharacters(){
        Integer number = friends.stream()
                .mapToInt(elem-> elem.length())
                .sum();
        System.out.printf("number of elements: " + number);
    }

    public static void pickLongest(){
        final Optional<String> longest =
                friends.stream()
                        .reduce((name1, name2) ->
                                (name1.length() >= name2.length())
                                    ? name1: name2
        );
        longest.ifPresent(name -> System.out.println("longest name: " + name));
    }

    class User{
        String name;
        int age;
        User(String name, int age){
            this.name = name;
            this.age = age;
        }

        public int getAge(){
            return age;
        }
    }
    public void reduce(){
        List<User> users = Arrays.asList(new User("John", 30), new User("Julie", 35));
        int computedAges =
                users.parallelStream()
                        .reduce(0, (partialAgeResult, user) -> partialAgeResult + user.getAge(), Integer::sum);
        System.out.println("computedAges:" + computedAges);
    }

    public static void printListWithCommaUsingJoin(){
        System.out.println("printListWithCommaUsingJoin: " + String.join(", ", friends));
    }

    public static void steveOrLongerNameFromPersons(){
        final List<Person> people = Arrays.asList(
                new Person("John", 4),
                new Person("Sara", 1),
                new Person("Jane", 2),
                new Person("Greg", 3));
        Person steveOrLonger =
            people.stream()
                    .reduce(new Person("Steve", 5), (person1, person2) ->
                            person1.getName().length() >= person2.getName().length() ? person1 : person2);
        System.out.printf("steveOrLonger: " + steveOrLonger);
    }
    public static void main(String[] args) {
        lengths();
        nameMoreLengths();
        sumLengthOfAllElements();
        namesWithN();
        startingWithN();
        startWithSomeLetter();
        countFriendsStartingWithLetter();
        pickName(friends,"N");
        gettingNames();
        totalNumberOfCharacters();
        pickLongest();
        Cap2 cap2 = new Cap2();
        cap2.reduce();
        printListWithCommaUsingJoin();
        steveOrLongerNameFromPersons();
    }
}
