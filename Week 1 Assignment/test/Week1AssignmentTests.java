import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Week1AssignmentTests {

    // Assignment 1 is tested using command line input.

    @Test
    void rightDigitTest() {
        List<Integer> testList1 = new ArrayList<Integer>();
        testList1.add(1);
        testList1.add(22);
        testList1.add(93);
        testList1.add(16);
        testList1.add(8);
        testList1.add(886);
        testList1.add(8);
        testList1.add(1);
        testList1.add(0);
        testList1.add(10);

        List<Integer> resultList1 = Assignment2.rightDigit(testList1);

        int[] expectedOutput = {1, 2, 3, 6, 8, 6, 8, 1, 0, 0};
        for(int i = 0; i < expectedOutput.length; i++){
            assertEquals(expectedOutput[i], resultList1.get(i));
        }

        List<Integer> testList2 = new ArrayList<Integer>();
        List<Integer> resultList2 = Assignment2.rightDigit(testList2);

        assertEquals(0, resultList2.size());
    }

    @Test
    void doublingTest() {
        List<Integer> testList1 = new ArrayList<Integer>();
        testList1.add(1);
        testList1.add(-1);
        testList1.add(6);
        testList1.add(0);
        testList1.add(-7);

        List<Integer> resultList1 = Assignment3.doubling(testList1);

        int[] expectedOutput = {2, -2, 12, 0, -14};
        for(int i = 0; i < expectedOutput.length; i++){
            assertEquals(expectedOutput[i], resultList1.get(i));
        }

        List<Integer> testList2 = new ArrayList<Integer>();
        List<Integer> resultList2 = Assignment3.doubling(testList2);

        assertEquals(0, resultList2.size());
    }

    @Test
    void noXTest() {
        List<String> testList1 = new ArrayList<String>();
        testList1.add("ax");
        testList1.add("xabcx");
        testList1.add("bbabba");
        testList1.add("x");
        testList1.add("bbabbaxxx");

        List<String> actualOutput1 = Assignment4.noX(testList1);

        List<String> testList2 = new ArrayList<String>();
        testList2.add("xx");
        testList2.add("x");

        List<String> actualOutput2 = Assignment4.noX(testList2);

        String[] expectedOutput1 = {"a", "abc", "bbabba", "", "bbabba"};
        String[] expectedOutput2 = {"", ""};

        for(int i = 0; i < expectedOutput1.length; i++){
            assertEquals(expectedOutput1[0], actualOutput1.get(0));
        }

        for(int i = 0; i < expectedOutput2.length; i++){
            assertEquals(expectedOutput2[0], actualOutput2.get(0));
        }
    }

    @Test
    void recursionTest() {
        int[] testArray1 = {2, 4, 8};
        int[] testArray2 = {1, 2, 4, 8, 1};
        int[] testArray3 = {2, 4, 4, 8};
        int[] testArray4 = {4, 4, 2, 5};
        int[] testArray5 = {4, 4, 2, 5, 7};

        assertTrue(Assignment5.groupSumClump(0, testArray1, 10));
        assertTrue(Assignment5.groupSumClump(0, testArray2, 14));
        assertFalse(Assignment5.groupSumClump(0, testArray3, 14));
        assertTrue(Assignment5.groupSumClump(0, testArray4, 8));
        assertTrue(Assignment5.groupSumClump(0, testArray1, 12));
        assertFalse(Assignment5.groupSumClump(0, testArray1, 3));
    }

    @Test
    void singletonTest() {
        SampleSingleton singleton = SampleSingleton.getInstance();
        SampleSingleton singletonAgain = SampleSingleton.getInstance();

        assertEquals(singleton, singletonAgain);
    }
}