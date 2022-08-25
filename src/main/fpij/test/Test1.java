package main.fpij.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

    public static void main(String[] args) {


//        List<Integer> tickets = Arrays.asList(5,1);
//        minDiff(tickets);
    }

     static class SinglyLinkedListNode {
          int data;
          SinglyLinkedListNode next;

         public int getData() {
             return data;
         }

         public void setData(int data) {
             this.data = data;
         }

         public SinglyLinkedListNode getNext() {
             return next;
         }

         public void setNext(SinglyLinkedListNode next) {
             this.next = next;
         }
     }

    public static long getNumber(SinglyLinkedListNode binary) {
        SinglyLinkedListNode singlyLinkedListNode = new SinglyLinkedListNode();
        singlyLinkedListNode.setData(1);

        SinglyLinkedListNode singlyLinkedListNode2 = new SinglyLinkedListNode();
        singlyLinkedListNode2.setData(2);
        singlyLinkedListNode.setNext(singlyLinkedListNode2);

        // Write your code here
        List array = new ArrayList();

        while (binary.next != null) {
            array.add(binary.getData());
            binary.getNext();
        }
        return 0;
    }

    public static int minDiff(List<Integer> arr){
        arr = arr.stream()
                .sorted()
                .collect(Collectors.toList());

        int sum= 0;
        for(int i = 0; i < arr.size()-1; i++){
            if(arr.get(i) > arr.get(i+1)){
                sum = sum + arr.get(i) - arr.get(i+1);
            }
            else {
                sum = sum + arr.get(i+1) - arr.get(i);
            }
        }
        System.out.println(sum);
        return sum;
    }

    static int maxTickets(List<Integer> tickets) {
        tickets = tickets.stream()
                .sorted()
                .collect(Collectors.toList());

        int maximun = 0;
        HashMap hashMap = new HashMap();
        for(int i = 0; i < tickets.size() -1; i++){
            if(tickets.get(i) == tickets.get(i+1) ||
                    tickets.get(i) +1 == tickets.get(i+1)) {
                maximun = maximun +1;
            }
            else {
                hashMap.put(hashMap.size()+1, maximun);
                maximun = 0;
            }
        }


        tickets.forEach(name ->
                System.out.println(name));
        return 0;

    }
    public static void function(){
        System.out.println("hola");


    }

}
