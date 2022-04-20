package fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class FileIOLectureExercise {
    public static void main(String[] args) throws IOException {
//        String fileName1="randomFile.txt";
//        String directory1="dir1";
//        String directory2="dir2";
//
//        Path  oneDirectory=Paths.get(directory1);
//
//        Path twoDirectoriesOneFile= Paths.get(directory2,directory1,fileName1);
//
//        System.out.println("twoDirectoriesOneFile.toAbsolutePath() = " + twoDirectoriesOneFile.toAbsolutePath());
//
//        System.out.println("oneDirectory.toAbsolutePath() = " + oneDirectory.toAbsolutePath());
//
//        Path absoPath=Paths.get("/","dir4");
//        System.out.println("absoPath.isAbsolute() = " + absoPath.isAbsolute());
//
//
//
//        String fileName="test.txt";
//        String directory="fileio.data";
//
//        Path filePath= Paths.get(directory,fileName);
//        System.out.println("filePath = " + filePath.getFileName());
//        System.out.println("filePath.toString() = " + filePath.toString());
//
//
//        Path fakePath=Paths.get("dir1","dir2","dir3");
//        System.out.println("fakePath.toAbsolutePath() = " + fakePath.toAbsolutePath());

//     dishes exercise create paths
        String directory="data";
        String fileName="dishes.txt";

        Path dataDir=Paths.get(directory);
        Path dishesPath=Paths.get(directory, fileName);
//    create dir if it doesn't exist


        List<String> fileData=null;

        try{
            if (Files.notExists(dataDir)) {
                Files.createDirectories(dataDir);
            }
            if (Files.notExists(dishesPath)){
                    Files.createFile(dishesPath);

            }  //        read the contents of the file and store in string list

           } catch (IOException e) {
            System.out.println("issue creating directory and file");
            e.printStackTrace();
            }


        try {
            fileData = Files.readAllLines(dishesPath);
            for (String line:fileData){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading files " + dishesPath.getFileName());
            e.printStackTrace();
        }
        FileManager dishes=new FileManager(fileName,directory);



        System.out.println();

        dishes.printLines();


        try {
            Files.write(dishesPath ,fileData);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error writing to file: " + dishesPath.getFileName());
        }


        List<String> moreDishes= Arrays.asList("Tomahawk Steak","Biscuits","Turkey");


        try{
            Files.write(dishesPath,moreDishes, StandardOpenOption.APPEND);
        }catch (IOException e){
            System.out.println("Error writing file");
        }

        try{
            fileData=Files.readAllLines(dishesPath);
        }catch (IOException e){
            System.out.println("File or dir cant be created");
        }

        for(String line:fileData){
            System.out.println(line);
        }

    }
}
