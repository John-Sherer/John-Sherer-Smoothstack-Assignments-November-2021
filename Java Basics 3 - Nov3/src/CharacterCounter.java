import java.io.*;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide the absolute or relative filepath to read from, or leave blank for default:");
        String input = sc.nextLine();
        if(input.length() == 0)
            input = "resources/in/ActIIISceneIV.txt";

        System.out.println("What character would you like to count for?:");
        String desiredCharacter = sc.nextLine();
        while(desiredCharacter.length() != 1) {
            System.out.println("Please provide only one character:");
            desiredCharacter = sc.nextLine();
        }
        char target = desiredCharacter.charAt(0);
        try(BufferedReader reader = new BufferedReader(
                new FileReader(input))){
            int nextChar = 0;
            int characterCount = 0;
            do {
                nextChar = reader.read();
                if (nextChar == target) {
                    characterCount++;
                }
            } while(nextChar!=-1);
            System.out.println("Number of '" + target + "' in the text: " + characterCount);
        } catch (FileNotFoundException e){
            System.out.println("Error, file not found.");
        } catch (IOException e){
            System.out.println("Error, encountered invalid input.");
        };
    }
}
