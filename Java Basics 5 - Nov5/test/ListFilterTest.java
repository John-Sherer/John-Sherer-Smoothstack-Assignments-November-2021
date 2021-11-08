import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListFilterTest {

    @Test
    void threeLetterAWords() {
        List<String> testInput = new ArrayList<String>();
        testInput.add("and");
        testInput.add("Able");
        testInput.add("cat");
        testInput.add("Ave");
        testInput.add("ARE");
        testInput.add("table");
        testInput.add("AR");

        List<String> actualOutput = ListFilter.ThreeLetterAWords(testInput);

        String[] expectedOutput = {"and", "Ave", "ARE"};
        for(int i = 0; i < 3; i++){
            assertEquals(expectedOutput[i], actualOutput.get(i));
        }
    }
}