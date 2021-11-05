import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileWriter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide the absolute or relative filepath to write to, or leave blank for default:");
        String input = sc.nextLine();
        if(input.length() == 0)
            input = "resources/in/OutputFile.txt";
        File file = new File(input);

        System.out.println("Please provide the additions you'd like to make to the file:");
        String additions = sc.nextLine();
        try(FileOutputStream outputStream = new FileOutputStream(file, true)){
            outputStream.write(additions.getBytes());
        } catch (FileNotFoundException e){
            System.out.println("Error, file not found.");
        } catch (IOException e){
            System.out.println("Error, encountered invalid input.");
        };
    }
}
