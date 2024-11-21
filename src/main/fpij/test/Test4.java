package main.fpij.test;

import main.fpij.cap3.comparator.Person;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 {


    public static void testCalendar(){

        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(2024, Calendar.AUGUST, 15, 10, 30, 0);
        int millisecond = 500;
        calendar3.set(Calendar.MILLISECOND, millisecond);
        String fecha =  new SimpleDateFormat("dd.MM.yyyy HH:MM:SS.ms").format(calendar3.getTime());
        System.out.println(fecha);
    }

    public static void main(String[] args) {

        testCalendar();
        testCalendar();
        try {
            Thread.sleep(500l);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        testCalendar();



//        Map<ReportedParamField, Optional<Integer>> headerMapCaseInsensitive = Arrays.stream(ReportedParamField.values()).collect(Collectors.toMap(f -> f, f -> {
//            Optional<Integer> headerField = headerMap.entrySet().stream().filter(e -> f.isFieldCaseInsensitive(e.getKey())).map(Entry::getValue).findFirst();
        Person p1 = new Person("Juan" ,45);
        Person p2 = new Person("Julia" ,65);
        Person[] persons = {p1, p2};


        String[] lista = new String[]{"hola", "que", "tal", "estas"};

        List<Integer> ages = Arrays.
                stream(persons)
                .map(person-> person.getAge())
                .collect(Collectors.toList());

//        System.out.println(ages);
    }
}
