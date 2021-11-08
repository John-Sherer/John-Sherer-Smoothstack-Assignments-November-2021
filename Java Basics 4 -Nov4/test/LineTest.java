import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

class LineTest {
    float delta = 0.001f;

    Line fortyFiveDegree = new Line(0,0,1,1);
    Line ninteyDegree = new Line(5.5f, 5.5f, 5.5f, 10.2f);
    Line horizontal = new Line(-5, -0.2f, -8.2f, -0.2f);
    Line horizontal2 = new Line(2, 2, 4, 2);

    Line parallel1 = new Line(-2, -3, 0.52f, 0.88f);
    Line parallel2 = new Line(-1, -1, 1.52f, 2.88f);
    @Test
    void slopeTests() {
        assertTrue(fortyFiveDegree.getSlope() - 45.0f <  delta);
        assertTrue(horizontal.getSlope() < delta);
    }

    @Test
    void InfiniteSlopeTest(){
        assertThrows(ArithmeticException.class, () -> {ninteyDegree.getSlope();});
    }

    @Test
    void DistanceTest() {
        assertTrue(fortyFiveDegree.getDistance() - Math.sqrt(2) < delta);
        assertTrue(horizontal.getDistance() - 3.2f < delta);
    }

    @Test
    void parallelTo() {
        assertTrue(horizontal.parallelTo(horizontal2));
        assertTrue(parallel1.parallelTo(parallel2));
        assertFalse(fortyFiveDegree.parallelTo(horizontal));
    }


}