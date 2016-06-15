package stasyuk.goit.module4.task2;

public class Temperature {
    public static double convertToFahrenheit (double celsius) {
        double fahrenheit;
        if (celsius<-273.15) throw new RuntimeException("Inappropriate value");
        fahrenheit = celsius*9/5 + 32.0;
        return fahrenheit;
        }
    public static double converToCelsius (double fahrenheit) {
        double celsius;
        if (fahrenheit<-460) throw new RuntimeException("Inappropriate value");
        celsius = (fahrenheit - 32.0)*5/9;
        return celsius;
    }



}

