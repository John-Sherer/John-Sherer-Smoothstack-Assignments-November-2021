import java.io.IOException;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("First, type your number of test cases on a single line. " +
                "Then provide pair of integers, where the first integer specifies the " +
                "condition to check for (1=odd/even, 2=prime, 3=palindrome) and the second " +
                "integer denotes the number to be checked");

        // Read user input and sanitize to a positive integer
        String input = sc.nextLine();
        int testCases = -1;
        while(testCases < 0) {
            try {
                testCases = Integer.parseInt(input);
                if(testCases < 0){
                    System.out.println("Error, number of cases must be positive. Please try again.");
                    input = sc.nextLine();
                }
            } catch (NumberFormatException e) {
                System.out.println("Error, could not read your input. Please try again.");
                input = sc.nextLine();
            }
        }

        int[] operations = new int[testCases]; // Storing the operation classifier
        int[] values = new int[testCases]; // Storing the inputs to operate on
        String rawInput = "";
        String[] stringPair;
        int firstInt, secondInt;
        for(int i = 0; i < testCases; i++){
            // Similar input sanitization method
            while(true){ // Loop until break; is reached
                rawInput = sc.nextLine();
                stringPair = rawInput.split(" ");
                if(stringPair.length != 2){
                    System.out.println("Error, did not identify input as a pair. Please try again.");
                    continue;
                }
                try {
                    firstInt = Integer.parseInt(stringPair[0]);
                    secondInt = Integer.parseInt(stringPair[1]);
                }catch (NumberFormatException e){
                    System.out.println("Error, did not identify input as integers. Please try again.");
                    continue;
                }
                if(firstInt > 3){
                    System.out.println("Error, there is not an operation corresponding to '" + firstInt + "'. Please try again");
                    continue;
                }
                operations[i] = firstInt - 1;
                values[i] = secondInt;
                break;
            }
        }

        // We now have inputs stored in an array, and we can process them quickly.
        // To expedite this even further, we can put our lambdas into an array.

        PerformOperation[] lambdas = {isOdd(), isPrime(), isPalindrome()};
        for(int i = 0; i < testCases; i++){
            System.out.println(lambdas[operations[i]].apply(values[i]));
        }
    }

    private static PerformOperation isOdd(){
        return (i) -> {
            if (i%2==0)
                return "EVEN";
            return "ODD";
        };
    }

    private static PerformOperation isPrime(){
        return (i) -> {
            for(int comp = 2; comp <= (i/2); comp++){
                if(i % comp == 0)
                    return "COMPOSITE";
            }
            return "PRIME";
        };
    }

    private static PerformOperation isPalindrome() {
        return (i) -> {
            char[] array = Integer.toString(i).toCharArray();
            for(int index = 0; index < array.length; index++){
                if(array[index] != array[array.length - index - 1])
                    return "NOT A PALINDROME";
            }
            return "PALINDROME";
        };
    }
}
