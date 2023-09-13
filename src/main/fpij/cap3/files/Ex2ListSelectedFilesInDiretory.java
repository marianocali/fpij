package main.fpij.cap3.files;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex2ListSelectedFilesInDiretory {

    public static void main(String[] args) {
        try{
        Files.newDirectoryStream(
                Paths.get("./src/main/fpij/cap3/files"), path -> path.toString().endsWith(".java"))
                        .forEach(System.out::println);
        }
        catch (Exception e){
            System.out.println("file not found: " + e.getMessage());
        }
    }
}
