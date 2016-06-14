package stasyuk.goit.module4.task1;

import stasyuk.goit.module6.NegativeAgeException;

public class Circle {
    public double calcAreaCircle (double radius) {
        double area = Math.PI * radius * radius;


        try {
            if (area < 0) {
                throw new NegativeValueException(area);
            }
        } catch (NegativeValueException e){
            System.out.println("Error: Value cannot be <=0");
        }
        return area;


    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        double radius = 25;
        double area = circle.calcAreaCircle(radius);

        System.out.println(area);
    }

}
