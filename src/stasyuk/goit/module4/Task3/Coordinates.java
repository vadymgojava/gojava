package stasyuk.goit.module4.task3;

public class Coordinates {
    public static double printDistance(double x1, double x2, double y1, double y2) {
        double distance;
        if (x1==x2 && y1==y2) throw new RuntimeException("Both objects have the same coordinates");
        distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return distance;
    }


}
