public class MaxArrayLocator {
    public static void main(String args[]){
        int[][] sampleArray = {{12, 67, 22, 47, 58},
                               {65, 18, 94, 81, 22},
                               {85, 14, 42, 87, 32},
                               {63, 14, 11, 58, 23},
                               {12, 39, 44, 15, 51}};
        int max = -1; // Our current maximum value, updates with each iteration
        int maxR = -1;
        int maxC = -1;
        for(int r = 0; r < sampleArray.length; r++){
            for(int c = 0; c < sampleArray[r].length; c++){
                if(sampleArray[r][c] > max){
                    max = sampleArray[r][c];
                    maxR = r;
                    maxC = c;
                }
            }
        }

        System.out.println("Maximum value is " + max + ", located at (" + maxR + ", " + maxC + ")");
    }
}
