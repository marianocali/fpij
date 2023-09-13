package main.fpij.cap3.files;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex1ListNameFilesInDirectory {

    public static void main(String[] args) {

        try {
            Files.list(Paths.get("."))
                    //.filter(Files::isDirectory)
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


