import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LamdaDemoTest {
    LamdaDemo stringSorter = new LamdaDemo();

    @Test
    void shortestToLongest() {
        List<String> testList = new ArrayList<String>();
        testList.add("Orpheus");
        testList.add("Eurydice");
        testList.add("Persephone");
        testList.add("Hades");
        testList.add("Hermes");

        List<String> answersList = stringSorter.ShortestToLongest(testList);

        String[] expectedAnswers = {"Hades", "Hermes", "Orpheus", "Eurydice", "Persephone"};
        for(int i = 0; i < 5; i++){
            assertEquals(expectedAnswers[i], answersList.get(i));
        }
    }

    @Test
    void longestToShortest() {
        List<String> testList = new ArrayList<String>();
        testList.add("Orpheus");
        testList.add("Eurydice");
        testList.add("Persephone");
        testList.add("Hades");
        testList.add("Hermes");

        List<String> answersList = stringSorter.LongestToShortest(testList);

        String[] expectedAnswers = {"Persephone", "Eurydice", "Orpheus", "Hermes", "Hades"};
        for(int i = 0; i < 5; i++){
            assertEquals(expectedAnswers[i], answersList.get(i));
        }
    }

    @Test
    void simpleAlphabetical() {
        List<String> testList = new ArrayList<String>();
        testList.add("Orpheus");
        testList.add("Eurydice");
        testList.add("Persephone");
        testList.add("Hades");
        testList.add("Fates");

        List<String> answersList = stringSorter.SimpleAlphabetical(testList);

        String[] expectedAnswers = {"Eurydice", "Fates", "Hades", "Orpheus", "Persephone"};
        for(int i = 0; i < 5; i++){
            assertEquals(expectedAnswers[i], answersList.get(i));
        }
    }

    @Test
    void stringsContainingE() {
        List<String> testList = new ArrayList<String>();
        testList.add("Orphxus");
        testList.add("Eurydice");
        testList.add("Persephone");
        testList.add("Hades");
        testList.add("Hxrmxs");

        List<String> answersList = stringSorter.StringsContainingE(testList);

        List<String> expectedFirstHalf = new ArrayList<>();
        expectedFirstHalf.add("Eurydice");
        expectedFirstHalf.add("Persephone");
        expectedFirstHalf.add("Hades");

        List<String> expectedSecondHalf = new ArrayList<>();
        expectedSecondHalf.add("Orphxus");
        expectedSecondHalf.add("Hxrmxs");

        for(int i = 0; i < 3; i++){
            assertTrue(expectedFirstHalf.contains(answersList.get(i)));
        }

        for(int i = 3; i < 5; i++){
            assertTrue(expectedSecondHalf.contains(answersList.get(i)));
        }
    }

    @Test
    void stringsContainingEHelper() {
        List<String> testList = new ArrayList<String>();
        testList.add("Orphxus");
        testList.add("Eurydice");
        testList.add("Persephone");
        testList.add("Hades");
        testList.add("Hxrmxs");

        List<String> answersList = stringSorter.StringsContainingEHelper(testList);

        List<String> expectedFirstHalf = new ArrayList<>();
        expectedFirstHalf.add("Eurydice");
        expectedFirstHalf.add("Persephone");
        expectedFirstHalf.add("Hades");

        List<String> expectedSecondHalf = new ArrayList<>();
        expectedSecondHalf.add("Orphxus");
        expectedSecondHalf.add("Hxrmxs");

        for(int i = 0; i < 3; i++){
            assertTrue(expectedFirstHalf.contains(answersList.get(i)));
        }

        for(int i = 3; i < 5; i++){
            assertTrue(expectedSecondHalf.contains(answersList.get(i)));
        }
    }
}