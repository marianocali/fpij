package main.fpij.test;

import java.util.ArrayList;
import java.util.List;

public class CharToInt {


    public static void main(String[] args) {
        String assignment = "1,2";
        List<Integer> assignmentNumbers = new ArrayList<>();
        assignment.chars()
                .filter(ch -> ch != ',')
                .forEach(ch -> assignmentNumbers.add(Character.getNumericValue(ch)));

        System.out.println("assignmentNumbers:" + assignmentNumbers);

    }
}
