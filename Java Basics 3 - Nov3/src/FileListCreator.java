import java.io.File;
import java.net.URL;
import java.util.Scanner;

public class FileListCreator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide the absolute filepath to read from:");
        String input = sc.nextLine();
        File file = new File(input);
        if(file.list() == null){
            System.out.println("Error, file not found.");
            return;
        }
        PrintFiles(file);
    }

    public static void PrintFiles(File f){
        File[] subfiles = f.listFiles();
        for(File file : subfiles){
            System.out.println(file.getName());
            if(file.isDirectory()){
                PrintFiles(file);
            }
        }
    }
}
