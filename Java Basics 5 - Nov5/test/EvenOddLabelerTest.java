import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EvenOddLabelerTest {

    @Test
    void labelIntegers() {
        List<Integer> testArray = new ArrayList<Integer>();
        testArray.add(3);
        testArray.add(15);
        testArray.add(-2);
        testArray.add(4);
        testArray.add(99);
        testArray.add(60);
        String expectedOutput = "o3,o15,e-2,e4,o99,e60";
        String actualOutput = EvenOddLabeler.LabelIntegers(testArray);
        System.out.println(actualOutput);
        assertEquals(expectedOutput, actualOutput);
    }
}