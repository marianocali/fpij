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

public class TestFilterNames {


    private static int index = 0;
    public static void main(String[] args) {
        readData();
    }

    public static void readData(){
        String fileName = "src/main/fpij/test/coding-test-data.txt";

        //read file into stream, try-with-resources
        HashMap<String,Integer> mapNames = new HashMap<>();
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            stream
                    .limit(6)
                    .forEach(TestFilterNames::processLine);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void processLine(String line){
        if(index %2 ==0){
            processLineWithNames(line);
        }
        index++;
    }

    private static void processLineWithNames(String line) {
        int firstNameStartingPosition;
        String firstName;
        int commaPosition;
        String lastName;
        Pattern pat = Pattern.compile("[a-zA-Z].*");
//        if(line.re)
        commaPosition = line.indexOf(",");
        firstNameStartingPosition = commaPosition +2;
        lastName = line.substring(0,commaPosition);
        firstName = line.substring(firstNameStartingPosition, line.indexOf(" ",firstNameStartingPosition));
        System.out.println("lastName: " + lastName + " " + "firstName: " + firstName);
    }

}