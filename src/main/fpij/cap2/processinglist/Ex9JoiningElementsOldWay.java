package main.fpij.cap2.processinglist;

import java.util.Arrays;
import java.util.List;

public class Ex9JoiningElementsOldWay {

    //we need to join a comma after every String except the last one
    final static List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scoot");

    public static void main(String args[]){

        join1rstVersion();
        System.out.println();
        join2ndtVersion();
        join3rdVersion();
    }

    public static void join1rstVersion(){
        for(String elem : friends){
            System.out.print(elem +  ", ");
        }
    }

    public static void join2ndtVersion(){
        for(int i=0; i < friends.size() -1; i++){
            System.out.print(friends.get(i) +  ", ");
        }
        if(friends.size() > 0){
            System.out.println(friends.get(friends.size()-1));
        }
    }

    public static void join3rdVersion(){
        System.out.println(String.join(", ", friends));
    }

}
