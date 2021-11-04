import java.io.IOException;

public class NumberAdder {
    public static void main(String args[]){
        // Store the sum as we go
        int result = 0;

        // Loop through each command line input
        for(String s : args){
            try{ // Catch any potential input exceptions
                result += Integer.parseInt(s); // Attempt to parse and add to sum
            }catch(NumberFormatException e){
                System.out.println("Error, did not recognize " + s + " as an integer. Ignoring this value.");
            }
        }
        // Print result
        System.out.println("The sum of these values is " + result);
    }
}
