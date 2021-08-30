package main.fpij.cap2.transforminglist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import java.util.stream.Collectors;

public class Ex6Transforming2List {


    public static void main(String[] args) {

        final List<String> friends = Arrays.asList("Brian", "Neat", "Neal", "Raju", "Sara", "Scott");
//        final List<String> friendsU= new ArrayList<>();
//        friends.forEach(name -> friendsU.add(name.toUpperCase()));
//        System.out.print(friendsU);

        List<Integer> brandIds = new ArrayList<>(Arrays.asList(18433, 18432));
        int n = 0;
        System.out.println("n " + n);
        n++;
        System.out.println("luego : n " + n);
        System.out.println("search.getBrandIds().toString(): " + brandIds);
        String stBrandIds = "";
        String sql = "b.brand_id in ";
        sql = sql + "(";


        for (Integer brandId: brandIds){
            stBrandIds += brandId + ",";
            sql += "?,";
        }
        stBrandIds = stBrandIds.substring(0, stBrandIds.length() -1);
        sql = sql.substring(0, sql.length() -1);

        sql += ")";

        System.out.println(sql);
        System.out.println("stBrandIds:" + stBrandIds);

//        friends.stream()
//                .map(name -> name.toUpperCase())
//                .collect(Collectors.toList())
//                .forEach(name ->
//                {
//                    System.out.println(name);
//                    sql = sql + "(?)");
//                });

//        friends.forEach(entry -> {
//            if(entry.getA() == null){
//                printA();
//            }
//            if(entry.getB() == null){
//                printB();
//            }
//            if(entry.getC() == null){
//                printC();
//            }
//        });


//        System.out.println("friends: " + friends);


//        friends.stream()
//        .map(String::toUpperCase)
//        .forEach(name -> System.out.print(name + " "));

    }
}


