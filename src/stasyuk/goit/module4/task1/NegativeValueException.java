package stasyuk.goit.module4.task1;


public class NegativeValueException extends IllegalStateException {
    private double areaValue;

    public NegativeValueException(double areaValue) {
        this.areaValue = areaValue;
    }

    public double getAreaValue() {
        return areaValue;
    }
}
