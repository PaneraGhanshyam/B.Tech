import java.util.Scanner;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();

        System.out.print("Convert to (C/F): ");
        char convertTo = scanner.next().toUpperCase().charAt(0);

        if (convertTo == 'F') {
            double fahrenheit = celsiusToFahrenheit(temperature);
            System.out.printf("%.2f Celsius is %.2f Fahrenheit%n", temperature, fahrenheit);
        } else if (convertTo == 'C') {
            double celsius = fahrenheitToCelsius(temperature);
            System.out.printf("%.2f Fahrenheit is %.2f Celsius%n", temperature, celsius);
        } else {
            System.out.println("Invalid option. Please enter 'C' or 'F'.");
        }

        scanner.close();
    }
}
