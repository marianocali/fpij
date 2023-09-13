package main.fpij.cap3.files;

import java.io.File;

public class Ex4ListHiddenFiles {

    public static void main(String[] args) {
        try{
            File[] files = new File(".").listFiles(File::isHidden);

            for (File file : files) {
                System.out.println(file);
            }
        }
        catch (Exception e){
            System.out.println("file not found: " + e.getMessage());
        }
    }
}
