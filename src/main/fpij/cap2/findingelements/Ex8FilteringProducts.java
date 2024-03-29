package main.fpij.cap2.findingelements;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Ex8FilteringProducts {


    public static void main(String[] args) {

        List<Product> products = new LinkedList<>();
        Product p1 = new Product();
        p1.setProductId(1);
        p1.setName("p1");

        Product p2 = new Product();
        p2.setProductId(2);
        p2.setName("p2");

        Product p3 = null;

        products.add(p1);
        products.add(p2);
        products.add(p3);

        List<Product> prodNotNull = products.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

        prodNotNull.stream()
                .forEach(p -> System.out.println("prod: " + p.getProductId() + " " + p.getName() ));
    }



//    private List<Product> getProducts(){
//        final List<Product> products = new LinkedList<>();
//
//        Product p1 = new Product();
//        p1.setProductId(1);
//        p1.setName("p1");
//        p1.setIsBag(true);
//
//        Product p2 = new Product();
//        p1.setProductId(2);
//        p1.setName("p2");
//        p1.setIsBag(true);
//
//        Product p3 = null;
//
//        products.add(p1);
//        products.add(p2);
//        products.add(p3);
//
//        return products;
//    }
//
//    static class SearchDTO{
//        private Boolean isBag;
//
//        public Boolean getIsBag() {
//            return isBag;
//        }
//
//        public void setIsBag(Boolean isBag) {
//            this.isBag = isBag;
//        }
//    }




}
