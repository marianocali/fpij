package main.fpij.cap3.files;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.concurrent.TimeUnit;

public class Ex6WatchingAFilesChanges {

    final static Path path  = Paths.get(".");

    public static void main(String[] args) {

        try{
            final WatchService watchService = path.getFileSystem().newWatchService();

            WatchKey watchKey = watchService.poll(1, TimeUnit.MINUTES);
            if(watchKey != null){
                watchKey.pollEvents().stream().forEach(event ->
                        System.out.println(event.context()));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }


}
