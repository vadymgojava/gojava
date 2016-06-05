package stasyuk.goit.module4.Task1;

public class Rectangle {
    public static void main(String[] args) {
        Figure figure = new Figure();
        double area = (figure.getSideA()*figure.getSideB());
        System.out.println(area);
    }
}
