package stasyuk.goit.module4.Task1;

public class Triangle {
    public static void main(String[] args) {
        Figure figure = new Figure();
        double p = ((figure.getKat1() + figure.getKat2() + figure.getGyp()) / 2);
        double area = Math.sqrt(p * (p - figure.getKat1()) * (p - figure.getKat2()) * (p - figure.getGyp()));
        System.out.println(area);
    }
}
