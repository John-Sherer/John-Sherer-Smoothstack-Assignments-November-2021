public class Assignment5 {
    public static boolean groupSumClump(int startIndex, int[] array, int sum){
        // Base case 1: we reach the end of the array
        if(startIndex >= array.length){
            return false;
        }

        //Consider each sequence of identical values as its own single iteration.
        int lookAhead = 1; //Checking ahead for identical values
        while(startIndex + lookAhead < array.length && array[startIndex] == array[startIndex+lookAhead]){
            lookAhead++;
        }

        // lookAhead now represents the number of sequential identical values.
        int localSum = array[startIndex] * lookAhead;
        // Base case 2: we have matched the sum exactly
        if(localSum == sum){
            return true;
        }

        // Iterative case 1: this step has an insufficient sum, see if it's part of a sequence
        if(groupSumClump(startIndex + lookAhead, array, sum - localSum))
            return true;

        // Iterative case 2: There exists a later sequence without this step
        if(groupSumClump(startIndex + lookAhead, array, sum))
            return true;

        // Base case 3: Neither of the iterative cases return true.
        return false;
    }
}
