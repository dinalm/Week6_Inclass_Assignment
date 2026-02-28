import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TripCalculatorTest {

    @Test
    void testCalculateDistanceNormal() {
        double result = TripCalculator.calculatDistance(60, 2);
        assertEquals(120.0, result, 0.001);
    }

    @Test
    void testCalculateDistanceZeroSpeed() {
        double result = TripCalculator.calculatDistance(0, 5);
        assertEquals(0.0, result, 0.001);
    }

    @Test
    void testCalculateDistanceZeroTime() {
        double result = TripCalculator.calculatDistance(100, 0);
        assertEquals(0.0, result, 0.001);
    }

    @Test
    void testCalculateDistanceBothZero() {
        double result = TripCalculator.calculatDistance(0, 0);
        assertEquals(0.0, result, 0.001);
    }

    @Test
    void testCalculateDistanceDecimalValues() {
        double result = TripCalculator.calculatDistance(55.5, 1.5);
        assertEquals(83.25, result, 0.001);
    }

    @Test
    void testCalculateDistanceLargeValues() {
        double result = TripCalculator.calculatDistance(1000, 24);
        assertEquals(24000.0, result, 0.001);
    }
}