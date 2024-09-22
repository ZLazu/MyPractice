package peex;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter degrees Fahrenheit");
        float degreesFahrenheit = scanner.nextFloat();
        float degreesCelsius = (degreesFahrenheit - 32) * 5 / 9;

        System.out.println(String.format("%.2f", degreesFahrenheit) + " degrees Fahrenheit is equal to " + degreesCelsius + " degrees Celsius");
        System.out.print(String.format("%.2f degrees Fahrenheit is equal to %.2f degrees Celsius", degreesFahrenheit, degreesCelsius));
        scanner.close();
    }
}