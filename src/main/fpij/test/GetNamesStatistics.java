package main.fpij.test;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class GetNamesStatistics {


    private static int index = 0;   //used to take the lines with data
    private static HashMap<String, Integer> firstNames = new HashMap<>();
    private static TreeMap<String, Integer> lastNames = new TreeMap<>();
    private static TreeMap<String, Integer> fullNames = new TreeMap<>();
    private static TreeMap<String, Integer> newNames = new TreeMap<>();

    public static void main(String[] args) {
        processFile();
    }

    public static void processFile(){
        String fileName = "src/main/fpij/test/coding-test-data.txt";

        //read file and store data into a stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            stream.forEach(GetNamesStatistics::processRawLine);
        } catch (IOException e) {
            e.printStackTrace();
        }
        printStatistics();
    }

    private static void printStatistics() {
        System.out.println("1. The names cardinality for full, last, and first names:");
        System.out.println("Full names : " + fullNames.size());
        System.out.println("First names: " + firstNames.size());
        System.out.println("Last names: " + lastNames.size());

        mostCommonLastNames();
        mostCommonFirstNames();
        createNewNames();

    }

    private static void mostCommonFirstNames() {
        System.out.println("3. The most common first names are:");
        firstNames.entrySet()
                .stream()
                .sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
                .limit(10)
                .forEach(System.out::println);
    }

    private static void mostCommonLastNames() {
        System.out.println("2. The most common last names are:");
        Set<Map.Entry<String, Integer>> last = lastNames.entrySet();
        last.stream()
                .sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
                .limit(10)
                .forEach(System.out::println);
    }

    public static void processRawLine(String line){
        if(index %2 ==0){
            processLineWithData(line);
        }
        index++;
    }

    /**
     *
     * comma indicate the finish of lastName after comma we have an space and then start firstName
     * so firstNameStartingPosition = comma + 2
     * @param line
     */
    private static void processLineWithData(String line) {
        int firstNameStartingPosition;
        String firstName;
        int commaPosition;
        String lastName;
        String regex = "[a-zA-Z]*";     // only a to z or A to Z characters

        commaPosition = line.indexOf(",");
        // lastName goes from 0 to comma
        lastName = line.substring(0,commaPosition);
        // the firstName starts 2 characters after comma
        firstNameStartingPosition = commaPosition +2;

        // firstName goes until the 2nd space in the line
        int firstNameEndingPosition = line.indexOf(" ", firstNameStartingPosition);
        firstName = line.substring(firstNameStartingPosition, firstNameEndingPosition);

        if(firstName.matches(regex) && lastName.matches(regex)) {
            countFirstNames(firstName);
            countLastNames(lastName);
            countFullNames(firstName, lastName);
            createNewNames();
        }
    }



    private static void countFirstNames(String firstName) {
        Optional<Integer> occurrenceFirstName;
        int occurrences = 1;
        occurrenceFirstName = Optional.ofNullable(firstNames.get(firstName));
        if(occurrenceFirstName.isPresent()) {
            occurrences = occurrenceFirstName.get() + 1;
        }
        firstNames.put(firstName, occurrences);
    }

    //if the lastName is not found in the collection then is the first time it appears -> occurrences = 1
    private static void countLastNames(String lastName) {
        Optional<Integer> occurrencesLastName;
        int occurrences = 1;

        occurrencesLastName = Optional.ofNullable(lastNames.get(lastName));
        if(occurrencesLastName.isPresent()) {
            occurrences = occurrencesLastName.get() + 1;
        }
        lastNames.put(lastName, occurrences);
    }

    private static void countFullNames(String firstName, String lastName) {
        String fullName = lastName + " " + firstName;
        Optional<Integer> occurrencesFullName;
        int occurrences = 1;

        occurrencesFullName = Optional.ofNullable(fullNames.get(fullName));
        if(occurrencesFullName.isPresent()) {
            occurrences = occurrencesFullName.get() + 1;
        }
        fullNames.put(fullName, occurrences);
    }

    /**
     Build a new list of N names by taking the first N names from the input file where the following is true:

     . No previous name in the new list has the same first name.
     . No previous name in the new list has the same last name.
     These modified names should only use first names and last names from the original N names.
     However, the new list and the old list should not share any full names.
     */
    private static void createNewNames() {

    }


}