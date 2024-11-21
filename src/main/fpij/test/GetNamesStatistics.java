package main.fpij.test;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class GetNamesStatistics {

    private static int index = 0;   //used to take the lines with data
    private static final HashMap<String, Integer> firstNames = new HashMap<>();
    private static final TreeMap<String, Integer> lastNames = new TreeMap<>();
    private static final TreeMap<String, Integer> fullNames = new TreeMap<>();
    private static final ArrayList newNames = new ArrayList();
    private static ArrayList<String> modifiedNames = new ArrayList<>();
    private static final ArrayList<FullName> originalNames = new ArrayList();
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
//        modifiedNames();
//      print new names
//      newNames.forEach(System.out::println);
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
            originalNames.add(new FullName(firstName, lastName));
            createNewNames(firstName, lastName);
            countFirstNames(firstName);
            countLastNames(lastName);
            countFullNames(firstName, lastName);
            createModifiedNames();
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
     For example, consider these names:

     Smith, Joan
     Smith, John
     Smith, Sam
     Thomas, Joan
     Upton, Joan
     Upton, Tom
     Vasquez, Cesar

     These names would be part of the new list:

     Smith, Joan
     Upton, Tom
     Vasquez, Cesar

     These names would not:

     Smith, John     # Already have a last name "Smith"
     Smith, Sam      # Already have a last name "Smith"
     Thomas, Joan    # Already have a first name "Joan"
     Upton, Joan     # Already have a first name "Joan"


     Step 2 - After you have built this list of N names, print as output of your program a new list that contains N modified names.
     This  These modified names should only use first names and last names from the original N names.
     However, the new list and the old list should not share any full names.

     Note: Each first name and last name should be used exactly once (see example of incorrect answer below with "Carl" being used multiple times)

     For example, if the file contains the names:

     Brutananadilewski, Carl
     Crews, Xander
     Cartman, Eric
     ... 22 more names if N=25 ...

     Then this is a valid output:

     Brutananadilewski, Eric
     Crews, Carl
     Cartman, Xander
     ... 22 more names if N=25 ...

     But this is not (because "Barney" and "Bambam" weren't in the original file):

     Brutananadilewski, Fred
     Crews, Barney
     Cartman, Bambam
     ... 22 more names if N=25 ...

     This is also incorrect (because "Cartman, Eric" is unchanged):

     Brutananadilewski, Xander
     Crews, Carl
     Cartman, Eric
     ... 22 more names if N=25 ...

     This is also incorrect (because "Carl" is used multiple times):

     Brutananadilewski, Xander
     Crews, Carl
     Cartman, Carl
     ... 22 more names if N=25 ...

     */
    private static void createModifiedNames() {
        for (int i =0; i<originalNames.size(); i++){

        }
//        if(!firstNames.containsKey(firstName) && !lastNames.containsKey(firstName)
//        && (!newNames.contains(lastName + ", " + firstName))) {
//              modifiedNames.add()
//            System.out.println("createModifiedNames");
        }

    private static void createNewNames(String firstName, String lastName) {
        if(!firstNames.containsKey(firstName) && !lastNames.containsKey(lastName)){
            newNames.add(lastName + ", " + firstName);
        }
    }


}