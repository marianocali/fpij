package main.fpij.test;

import java.util.HashMap;
import java.util.Objects;

public class HashMapExample {

    // Create a HashMap object called capitalCities
    static HashMap<String, String> capitalCities = new HashMap<String, String>();

    public static void main(String[] args) {
        loadCities();
        System.out.println(capitalCities);

        //Access an Item by the key
        System.out.println("Access an Item using get: " + capitalCities.get("England"));

        removeItem();
        removeAllItems();
        loadCities();
        //To find out how many items there are, use the size()
        System.out.println("capitalCities size: " + capitalCities.size());
        loopThroughHashMap();
        printNotNullsValues();

    }

    private static void loopThroughHashMap() {
        //Loop Through a HashMap
        //Use the keySet() method if you only want the keys, and use the values() method if you only want the values:
        System.out.println("capitalCities keys:");
        capitalCities.forEach((key, value)-> System.out.print(key + " "));

        System.out.println();
        System.out.print("hashMap values: " );
        System.out.print(String.join(", ",capitalCities.values()));
    }

    private static void removeAllItems() {
        //To remove all items, use the clear()
        capitalCities.clear();
        System.out.println("To remove all items, use the clear()");
        System.out.println("capitalCities:" + capitalCities );
    }

    private static void removeItem() {
        //Remove an Item
        System.out.println("Remove an Item England");
        capitalCities.remove("England");
        System.out.println("Access an Item using get: " + capitalCities.get("England"));
    }

    private static void loadCities() {
        // Add keys and values (Country, City)
        System.out.println("loadCities ");
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put(null, null);

    }

    public static void printNotNullsValues(){
        System.out.println();
        System.out.println("NotNullsValues ");
        capitalCities.values().stream()
                .filter(Objects::nonNull)
                .forEach(elem-> System.out.print(elem + " "));

    }

}
