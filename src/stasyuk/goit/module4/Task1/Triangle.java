package stasyuk.goit.module4.task1;

public class Triangle {
    public static double calcAreaTriangle(double kat1, double kat2, double gyp) {
        double p;
        p = ((kat1 + kat2 + gyp) / 2);
        double area;
        area = Math.sqrt(p * (p - kat1) * (p - kat2) * (p -gyp));
        return area;
    }
}
