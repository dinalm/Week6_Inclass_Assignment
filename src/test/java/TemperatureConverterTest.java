import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    private TemperatureConverter converter;

    @BeforeEach
    void setUp() {
        // Create a new converter before each test
        converter = new TemperatureConverter();
    }

    @Test
    void testFahrenheitToCelsius() {
        // Freezing point
        assertEquals(0,   converter.fahrenheitToCelsius(32),  0.01);

        // Boiling point
        assertEquals(100, converter.fahrenheitToCelsius(212), 0.01);

        // Negative temperature
        assertEquals(-40, converter.fahrenheitToCelsius(-40), 0.01);

        // Room temperature
        assertEquals(25,  converter.fahrenheitToCelsius(77),  0.01);
    }

    @Test
    void testCelsiusToFahrenheit() {
        // Freezing point
        assertEquals(32,  converter.celsiusToFahrenheit(0),   0.01);

        // Boiling point
        assertEquals(212, converter.celsiusToFahrenheit(100), 0.01);

        // Negative temperature
        assertEquals(-40, converter.celsiusToFahrenheit(-40), 0.01);

        // Room temperature
        assertEquals(77,  converter.celsiusToFahrenheit(25),  0.01);
    }

    @Test
    void testIsExtremeTemperature() {
        // Extreme cold (below -40°C)
        assertTrue(converter.isExtremeTemperature(-41));
        assertTrue(converter.isExtremeTemperature(-50));

        // Extreme heat (above 50°C)
        assertTrue(converter.isExtremeTemperature(51));
        assertTrue(converter.isExtremeTemperature(60));

        // Boundary values
        assertFalse(converter.isExtremeTemperature(-40));
        assertFalse(converter.isExtremeTemperature(50));

        // Normal temperatures
        assertFalse(converter.isExtremeTemperature(0));
        assertFalse(converter.isExtremeTemperature(25));
        assertFalse(converter.isExtremeTemperature(-20));
    }

    @Test
    void testKelvinToCelsius() {

        assertEquals(26.85, converter.kelvinToCelsius(300), 0.01);

        assertEquals(-273.15, converter.kelvinToCelsius(0), 0.01);

        // Boiling point
        assertEquals(100.0, converter.kelvinToCelsius(373.15), 0.01);

        // Freezing point
        assertEquals(0.0, converter.kelvinToCelsius(273.15), 0.01);

        // Body temperature
        assertEquals(37.0, converter.kelvinToCelsius(310.15), 0.01);
    }
}