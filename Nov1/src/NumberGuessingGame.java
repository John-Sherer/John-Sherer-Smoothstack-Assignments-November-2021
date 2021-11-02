import java.io.*;
import java.util.Random;

public class NumberGuessingGame {
    static BufferedReader reader;
    static Random numberGenerator;

    public static void main(String args[]){
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            numberGenerator = new Random();

            int secretNumber = numberGenerator.nextInt(100) + 1;
            System.out.println("Secret number is " + secretNumber);
            int guess = -1;
            int attempts = 0;
            do {
                System.out.println("Type your guess below:");
                try {
                    guess = Integer.parseInt(reader.readLine());
                } catch(NumberFormatException e){
                    System.out.println("Oops, please make sure your output is a number.");
                    continue;
                }
                if(guess <= 0 || guess > 100){
                    System.out.println("Oops, please make sure your output is between 1 and 100.");
                    continue;
                }
                attempts ++;
                if(Math.abs(guess - secretNumber) <= 10){
                    System.out.println("Congratulations, the number was " + secretNumber +
                                        " and you got in range of it in " + attempts + " attempts!");
                    System.exit(0);
                }
                System.out.println("Not quite!");
            } while(attempts < 5);
            System.out.println("Sorry! The answer was " + secretNumber);
            System.exit(0);
        } catch(IOException e) {
            System.out.println("Error, encountered exception while reading input stream.");
            System.exit(-1);
        }
    }
}
