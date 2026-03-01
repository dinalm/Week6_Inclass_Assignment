import java.util.Scanner;

public class TemperatureConverter {

    // Convert Fahrenheit to Celsius
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Check if temperature is extreme
    public boolean isExtremeTemperature(double celsius) {
        return celsius < -40 || celsius > 50;
    }

    // Convert Kelvin to Celsius
    public double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TemperatureConverter converter = new TemperatureConverter();

        System.out.print("Enter temperature value: ");
        double value = scanner.nextDouble();

        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Kelvin to Celsius");
        System.out.print("Choose conversion (1-3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                double celsius = converter.fahrenheitToCelsius(value);
                System.out.printf("Result: %.2f °C%n", celsius);
                System.out.println("Extreme temperature: " +
                        (converter.isExtremeTemperature(celsius) ? "Yes" : "No"));
                break;
            case 2:
                System.out.printf("Result: %.2f °F%n",
                        converter.celsiusToFahrenheit(value));
                System.out.println("Extreme temperature: " +
                        (converter.isExtremeTemperature(value) ? "Yes" : "No"));
                break;
            case 3:
                double celsiusFromKelvin = converter.kelvinToCelsius(value);
                System.out.printf("Result: %.2f °C%n", celsiusFromKelvin);
                System.out.println("Extreme temperature: " +
                        (converter.isExtremeTemperature(celsiusFromKelvin) ? "Yes" : "No"));
                break;
            default:
                System.out.println("Invalid choice");
        }
        scanner.close();
    }
}

