package main.fpij.cap3.files;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex5ListingSubdirectoriesWithFlatMap {

    public static void main(String[] args) {
        listSubdirectories();
        countFilesPlusSubdirectories();
    }

    public static void listSubdirectories(){
        Stream.of(new File(".").listFiles())
                .flatMap(file -> file.listFiles() == null ? Stream.of(file) : Stream.of(file.listFiles()))
                .forEach(System.out::println);
    }

    public static void countFilesPlusSubdirectories(){
        List<File> files = Stream.of(new File(".").listFiles())
                .flatMap(file -> file.listFiles() == null ? Stream.of(file) : Stream.of(file.listFiles()))
                .collect(Collectors.toList());
        System.out.println("count: " + files.size());
    }
}
