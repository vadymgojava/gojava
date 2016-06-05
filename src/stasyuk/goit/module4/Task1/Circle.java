package stasyuk.goit.module4.Task1;

public class Circle {
    public static void main(String[] args) {
        Figure figure = new Figure();
        double area = Math.PI * figure.getRadius() * figure.getRadius();
        System.out.println(area);

    }

}
