package main.fpij.test;

import java.util.HashMap;
import java.util.Set;

public class HashMapExample2 {


    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        loadDays(hashMap);

        System.out.println("elements in HashMap hashMap:" +  hashMap.entrySet());

        System.out.println("hashMap hashMap size: " + hashMap.size());
        copy(hashMap);
        cleanHashMap(hashMap);
        isEmpty(hashMap);
        loadDays(hashMap);
        shallowCopy(hashMap);
        containsKey(hashMap);
        containsValue(hashMap);
        getSetFromHashMap(hashMap);
        getValueForAKey(hashMap);
        getKeys(hashMap);
        updateHashMap(hashMap);
        delete(hashMap);
        defaultValue(hashMap);
        iterateWithForEach(hashMap);
        iterateForKeys(hashMap);
    }

    private static void loadDays(HashMap<Integer, String> hashMap) {
        hashMap.put(1, "Monday");
        hashMap.put(2,"Tuesday");
        hashMap.put(3,"Wednesday");
        hashMap.put(4,"Thursday");
        hashMap.put(5,"Friday");
        hashMap.put(6,"Saturday");
        hashMap.put(7,"Sunday");
    }

    //3. copy all mappings from the specified map to another map.
    static void copy(HashMap<Integer,String> hashMap){
        HashMap<Integer, String> hashMap2 = new HashMap<>();
        hashMap2 = (HashMap<Integer, String>) hashMap.clone();
        System.out.println("hashMap 2 with clone: " + hashMap2 );
    }

    //4. remove all mappings from a map.
    static void cleanHashMap(HashMap hashMap) {
        hashMap.clear();
        System.out.println("HashMap after removing all mappinngs: " + hashMap);
        System.out.println("HashMap is empty: " + hashMap.isEmpty());
    }

    //5. check whether a map is empty or not
    static void isEmpty(HashMap<Integer,String> hashMap) {
        System.out.println("hashMap is empty: " + hashMap.isEmpty());
    }

    //6. get a shallow copy of a HashMap instance
    static void shallowCopy(HashMap<Integer,String> hashMap){
        HashMap<Integer, String> hashMap2 = new HashMap();
        hashMap2 = (HashMap) hashMap.clone();
        System.out.println("hashMap 3 with putAll: " + hashMap2);
    }

    //7. test if a map contains a mapping for the specified key.
    static void containsKey(HashMap<Integer,String> hashMap) {
        Integer keyToFind = 2;
        if (hashMap.containsKey(keyToFind)) {
            System.out.println("contains key " + keyToFind + ": true");
        } else {
            System.out.println("contains key " + keyToFind + ": false");
        }
    }

    // 8. test if a map contains a mapping for the specified value.
    static void containsValue(HashMap<Integer,String> hashMap) {
        String value = "Thursday";
        if (hashMap.containsValue(value)) {
            System.out.println("contains value " + value + ": true");
        } else {
            System.out.println("contains value " + value + ": false");
        }
    }

    //9. create a set view of the mappings contained in a map.
    static void getSetFromHashMap(HashMap<Integer,String> hashMap) {
        Set set = hashMap.entrySet();
        System.out.println("set: " + set);
    }

    //10. get the value of a specified key in a map.
    static void getValueForAKey(HashMap<Integer,String> hashMap) {
        Integer keyToFind = 4;
        System.out.println( "Value obteined with key " + keyToFind +": " + hashMap.get(keyToFind));
    }

    //11. Write a Java program to get a set view of the keys contained in this map.
    static void getKeys(HashMap<Integer,String> hashMap){
        Set<Integer> keys = hashMap.keySet();
        System.out.println("keys in hashMap are: " + keys);
    }

    // update hashMap
    static void updateHashMap(HashMap<Integer,String> hashMap){
        hashMap.put(8, "Dosa");
        System.out.println("hashMap with new value: " + hashMap);
    }

    //eliminar una entrada o clave valor
    static void delete(HashMap hashMap){
        hashMap.remove(8);
        System.out.println("hashMap after delete new value: " + hashMap);
    }

    //using default Value
    static void defaultValue(HashMap<Integer, String> hashMap){
        hashMap.put(8, hashMap.getOrDefault(8, "0"));
        System.out.println("hashMap with Default Value: " + hashMap);
        hashMap.remove(8);
    }

    //iterate hashMap
    static void iterateWithForEach(HashMap<Integer,String> hashMap){
        hashMap.forEach((key, value) -> System.out.println("[Key] : " + key + " [Value] : " + value));
    }

    static void iterateForKeys(HashMap<Integer,String> hashMap){
        for(Integer key : hashMap.keySet()){
            System.out.println(key + ": " + hashMap.get(key));
        }
    }

    public static void procesHashMap(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        HashMap<Integer, String> newHashMap = new HashMap<>();
        hashMap.put(1, "1");
        hashMap.put(2, "2");
        hashMap.put(3, "3");
        hashMap.put(4, "4");
        hashMap.put(5, "5");
        hashMap.put(6, "6");
        hashMap.put(7, "7");
        hashMap.put(8, "8");
        hashMap.put(9, "9");
        hashMap.put(10, "10");
        hashMap.put(11, "11");
        hashMap.put(12, "12");
        hashMap.put(13, "13");
        hashMap.put(14, "14");
        hashMap.put(15, "15");
        hashMap.put(16, "16");
        hashMap.put(17, "17");
        hashMap.put(18, "18");
        hashMap.put(19, "19");
        hashMap.put(20, "20");
        hashMap.put(21, "21");

        // hashMap.forEach((key, value) -> System.out.println("[Key] : " + key + " [Value] : " + value));

        int sizeHashmap = hashMap.size();
        int midlePoint = sizeHashmap /2;

        int positionNewMap = 1;
        for(int i = 1; i <= midlePoint; i++){
            newHashMap.put(positionNewMap, hashMap.get(i));
            positionNewMap = positionNewMap+2;
        }

        positionNewMap = 2;
        for(int i = 1; i <= midlePoint; i++){
            newHashMap.put(positionNewMap, hashMap.get(midlePoint + i));
            positionNewMap = positionNewMap+2;
        }
        //get Last element if odd number od elements
        if(sizeHashmap % 2 !=0){
            newHashMap.put(sizeHashmap, hashMap.get(sizeHashmap));
        }

        newHashMap.forEach((key,value) -> System.out.println("[key]:" + key + " [value]: " + value));
        //copy hashMap
        hashMap = (HashMap<Integer, String>) newHashMap.clone();

        System.out.println("afteer copy: ");
        hashMap.forEach((key,value) -> System.out.println("[key]:" + key + " [value]: " + value));

        //1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
        //1,11, 2, 12, 3, 13, 4, 14, 5, 15, 6, 16,7,17,8,18,9,19,10,20
        // System.out.println("midlePoint:" + midlePoint);




        /*
        int index = 1;
        int round =0;
        while(index < sizeHashmap){
            if(index%2 != 0){
                newHashMap.put(index, hashMap.get(index));
                round ++;
            }else{
                newHashMap.put(index, hashMap.get(midlePoint + index-1));
                round ++;
            }
            System.out.println("newHashMap: " + newHashMap.get(index));
            index++;
            if(round == 2){
                index--;
                round = 0;
            }
            System.out.println("index: " + index + " round: " + round);
        }
*/

//        for(int i=1; i < sizeHashmap; i++){
//            if(i%2 != 0){
//                newHashMap.put(i, hashMap.get(i));
//            }else{
//                newHashMap.put(i, hashMap.get(midlePoint + i-1));
//            }
//        }

    }


}
