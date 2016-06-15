package stasyuk.goit.module4.task1;

public class Rectangle {
    public static double calcAreaRectangle (double sideA, double sideB) {
        double area = sideA*sideB;
        if (sideA<0 || sideB<0) throw  new ArithmeticException("Value should not be <0");
        return area;
    }


}
