package stasyuk.goit.module4.task2;

public class Temperature {
    public static double convertToFahrenheit (double celsius) {
        double fahrenheit;
        fahrenheit = celsius*9/5 + 32.0;
        return fahrenheit;
        }
    public static double converToCelsius (double fahrenheit) {
        double celsius;
        celsius = (fahrenheit - 32.0)*5/9;
        return celsius;
    }

}

