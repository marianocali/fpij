package main.fpij.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Child extends Parent {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        List<Parent> list = new ArrayList<>();
        Child c1 = new Child();
        c1.setId("1");
        c1.setName("Mariano");
        list.add(c1);

        list.stream().forEach(elem -> System.out.println(elem.getId() + " " + ((Child) elem).getName()));
    }
}
