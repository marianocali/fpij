package main.fpij.cap3.files;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex3ListHiddenFiles {

    public static void main(String[] args) {
        try{
            final File[] files = new File(".").listFiles(file-> file.isHidden());

            for (File file : files) {
                System.out.println(file);
            }
        }
        catch (Exception e){
            System.out.println("file not found: " + e.getMessage());
        }
    }

}
