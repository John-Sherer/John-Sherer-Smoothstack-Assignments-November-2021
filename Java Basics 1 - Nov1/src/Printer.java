public class Printer {
    public static void main(String args[]){
        System.out.println("" + 1 + ")");
        PrintAsteriskSequence(1, 1, 0, 0);
        PrintPeriodSequence(9);

        System.out.println("" + 2 + ")");
        PrintPeriodSequence(10);
        PrintAsteriskSequence(4, -1, 0, 0);

        System.out.println("" + 3 + ")");
        PrintAsteriskSequence(1, 2, 5, -1);
        PrintPeriodSequence(11);

        System.out.println("" + 4 + ")");
        PrintPeriodSequence(12);
        PrintAsteriskSequence(7, -2, 2, 1);
    }

    /**
     * Prints out four strings of asterisks
     * @param initialSize num asterisks in the first line
     * @param delta change in asterisks per line
     * @param initialSpaces num spaces preceding the asterisks in the first line
     * @param spaceDelta change in spaces per line
     */
    private static void PrintAsteriskSequence(int initialSize, int delta, int initialSpaces, int spaceDelta){
        String output = "";
        for(int lineNumber = 0; lineNumber < 4; lineNumber ++){
            // Print spaces
            for(int i = 0; i < initialSpaces + spaceDelta * lineNumber; i++){
                output += " ";
            }
            // Print asterisks
            for(int i = 0; i < initialSize + delta * lineNumber; i++){
                output += "*";
            }
            if(lineNumber < 3) {
                output += "\n";
            }
        }
        System.out.println(output);
    }

    /**
     * Prints a string of periods
     * @param length the length of the string
     */
    private static void PrintPeriodSequence(int length){
        String output = "";
        for(int i = 0; i < length; i++){
            output += ".";
        }
        System.out.println(output);
    }
}
