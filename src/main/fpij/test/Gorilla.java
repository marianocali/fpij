package main.fpij.test;

public class Gorilla {

    public static void main(String[] args) {
        String[] input = {"Viena-Prague 312","Prague-Zurich 676"};
        calculator(input);
    }

    public static String calculator( String[] distancesList ) {
        final double perLitre= 1.30;
        final int consumption = 8;
        int totalDistance = 0;
        int[] distances = new int[distancesList.length];
        for(int i = 0; i < distancesList.length; i++) {
            String item = distancesList[i];
            String[] words = item.split(" ");
            String distInKm = words[words.length-1];
            distances[i] = Integer.parseInt(distInKm);
        }
        int maxDistance = 0;
        int max = 0;
        for(int i = 0; i < distances.length; i++) {
            if(distances[i] > maxDistance) {
                totalDistance += distances[i];
                max = i;
            }
        }
        float totalExpences = (float) ((totalDistance/consumption) * perLitre);

        for(int i=0; i< distances.length; i++){
            if(maxDistance < distances[i]){
                maxDistance = distances[i];
            }
        }

        int endOfTitle = distancesList[max].indexOf("" + maxDistance);
        String longestDistance = new String();
        if(endOfTitle != -1) {
            longestDistance = distancesList[max].substring(0, endOfTitle);
        }
        StringBuffer sb = new StringBuffer();
        sb.append("Total expenses:").
                append(totalExpences).
                append("$;Longest distance:").append(longestDistance).append(" ");

        System.out.println(sb);

        return sb.toString();
    }


}
