package stasyuk.goit.module5;

import java.util.Arrays;

public class Array {
    public static int minValue(int[] intNumbers) {

        Arrays.sort(intNumbers);
        int minValue = intNumbers[0];
        return minValue;

    }

    public static int maxValue(int[] intNumbers) {

        Arrays.sort(intNumbers);
        int maxValue = intNumbers[intNumbers.length - 1];
        return maxValue;
    }
// ЭТОД МЕТОД ТОЛЬКО ДЛЯ ПРОВЕРКИ
    public static void main(String[] args) {
        Array array  = new Array();
        int [] intNumbers = new int[]{2, 2, 23, 23, 34, 1, -10};
        int maxValue  = array.maxValue(intNumbers);
        int minValue  = array.minValue(intNumbers);
        for (int element1: intNumbers) {
            System.out.println(element1);

        }

        System.out.println("Max Value" + maxValue);
        System.out.println("Min Value" + minValue);
    }
}


