package main.fpij.test;

import java.util.*;
import java.util.stream.Collectors;

public class HashMap3 {


    protected static <T> List<T> sortListInTwoColumnsGeneric(List<String> telemetryFlated){
        int sizeTelemetry = telemetryFlated.size();
        boolean isOdd = (sizeTelemetry % 2) != 0;
        int middlePoint = (telemetryFlated.size() /2) + (isOdd ? 1 : 0) ;

        ArrayList<T> parametersTelemetry = new ArrayList<T>(sizeTelemetry);

        int positionNewList = 0;
        for(int i = 0; i < middlePoint; i++){
//            parametersTelemetry.add(positionNewList, telemetryFlated.get(i));

            positionNewList++;
            if (middlePoint + i < telemetryFlated.size())
//                parametersTelemetry.add(positionNewList, telemetryFlated.get(middlePoint + i));

            positionNewList++;
        }

        return parametersTelemetry;
    }

    public static void main(String[] args) {

        List<String> lista1 = new ArrayList<>();
        lista1.addAll(Arrays.asList("1", "2", "3","4", "5", "6"));

        Collection<String> lista2 = new ArrayList<>();
        lista2.addAll(Arrays.asList("7", "8", "9"));

        Collection<String> lista3 = new ArrayList<>();
        lista3.addAll(Arrays.asList("10", "11", "12","13", "14", "15","16", "17", "18","19"));

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"));


        Map<String, Collection<String>> telemetry = new HashMap<>();
//        telemetry.put("a", lista1);
//        telemetry.put("b", lista2);
//        telemetry.put("c", lista3);

        telemetry.put("a", list);



        List<String> telemetryFlated = telemetry.values().stream().flatMap(d -> {
            d.add(null);
            return d.stream();
        }).toList();

        System.out.println("telemetryFlated: " + telemetryFlated);
        telemetryFlated = sortListInTwoColumns(telemetryFlated);
        System.out.println("telemetryFlated and sorted in 2 columns: " + telemetryFlated);
    }



    /**
     * Sort the elements of a List in the following mode: take the middle element the firsts elements
     * input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21]
     * output [1, 11, 2, 12, 3, 13, 4, 14, 5, 15, 6, 16, 7, 17, 8, 18, 9, 19, 10, 20, 21]
     * Because it will used in the view to show in 2 columns
     * @param telemetryFlated
     * @return
     */
    public static List<String> sortListInTwoColumns(List<String> telemetryFlated){
        int sizeTelemetry = telemetryFlated.size();
        int middlePoint = telemetryFlated.size() /2;
        String[] parametersTelemetry = new String[sizeTelemetry];

        int positionNewList = 0;
        for(int i = 0; i < middlePoint; i++){
            parametersTelemetry[positionNewList] = telemetryFlated.get(i);
            positionNewList++;
            parametersTelemetry[positionNewList] = telemetryFlated.get(middlePoint + i);
            positionNewList++;
        }
        //get Last element if odd number od elements
        if((sizeTelemetry % 2) != 0){
            parametersTelemetry[sizeTelemetry-1] = telemetryFlated.get(sizeTelemetry-1);
        }
        telemetryFlated = Arrays.stream(parametersTelemetry).toList();
        return telemetryFlated;
    }

    public static List<String> sortListInTwoColumnsOld(List<String> telemetryFlated){
        int sizeTelemetry = telemetryFlated.size();
        int middlePoint = telemetryFlated.size() /2;
        String[] parametersTelemetry = new String[sizeTelemetry];


        int positionNewList = 0;
        for(int i = 0; i < middlePoint; i++){
            parametersTelemetry[positionNewList] = telemetryFlated.get(i);
            positionNewList = positionNewList+2;
        }

        positionNewList = 1;
        for(int i = 0; i < middlePoint; i++){
            parametersTelemetry[positionNewList] = telemetryFlated.get(middlePoint + i);
            positionNewList = positionNewList+2;
        }
        //get Last element if odd number od elements
        if((sizeTelemetry % 2) != 0){
            parametersTelemetry[sizeTelemetry-1] = telemetryFlated.get(sizeTelemetry-1);
        }
        telemetryFlated = Arrays.stream(parametersTelemetry).toList();
        return telemetryFlated;
    }



    public static void sortListInTwoColumns(){
        List<Integer> selectedParametersTelemetry = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21);
        int sizeTelemetry = selectedParametersTelemetry.size();
        int middlePoint = selectedParametersTelemetry.size() /2;
        Integer[] parametersTelemetry = new Integer[sizeTelemetry];


        int positionNewList = 0;
        for(int i = 0; i < middlePoint; i++){
            parametersTelemetry[positionNewList] = selectedParametersTelemetry.get(i);
            positionNewList = positionNewList+2;
        }

        positionNewList = 1;
        for(int i = 0; i < middlePoint; i++){
            parametersTelemetry[positionNewList] = selectedParametersTelemetry.get(middlePoint + i);
            positionNewList = positionNewList+2;
        }
        //get Last element if odd number od elements
        if((sizeTelemetry % 2) != 0){
            parametersTelemetry[sizeTelemetry-1] = selectedParametersTelemetry.get(sizeTelemetry-1);
        }

        System.out.println("original selectedParametersTelemetry: " + selectedParametersTelemetry);
        System.out.println("parametersTelemetry: " + Arrays.toString(parametersTelemetry));
        selectedParametersTelemetry = Arrays.stream(parametersTelemetry).toList();

        System.out.println("selectedParametersTelemetry after changes " + selectedParametersTelemetry);
    }



}