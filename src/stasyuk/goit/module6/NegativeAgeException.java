package stasyuk.goit.module6;


public class NegativeAgeException extends Exception {
    private int ageValue;

    public NegativeAgeException(int ageValue) {
        this.ageValue = ageValue;
    }

    public int getAgeValue() {
        return ageValue;
    }
}

