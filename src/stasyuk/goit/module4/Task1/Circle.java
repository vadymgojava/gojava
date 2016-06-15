package stasyuk.goit.module4.task1;

public class Circle {
    public static double calcAreaCircle (double radius) {
        double area = Math.PI * radius * radius;
        if (radius < 0) throw new ArithmeticException("Radius could not be <0");
        return area;


    }


}
