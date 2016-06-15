package stasyuk.goit.module5;

import java.util.Arrays;

public class Array {
    public static int minValue(int[] intNumbers) {

        Arrays.sort(intNumbers);
        int minValue = intNumbers[0];
        if (minValue<0) throw new RuntimeException("The lowest value in Array should not be <0");

        return minValue;

    }

    public static int maxValue(int[] intNumbers) {

        Arrays.sort(intNumbers);
        int maxValue = intNumbers[intNumbers.length - 1];
        return maxValue;
    }

}


