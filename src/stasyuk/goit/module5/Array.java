package stasyuk.goit.module5;

import java.util.Arrays;

public class Array {
    public int MinValue(int[] intNumbers) {

        Arrays.sort(intNumbers);
        int minValue = intNumbers[0];
        return minValue;

    }

    public int MaxValue(int[] intNumbers) {

        Arrays.sort(intNumbers);
        int maxValue = intNumbers[intNumbers.length - 1];
        return maxValue;
    }
// ЭТОД МЕТОД ТОЛЬКО ДЛЯ ПРОВЕРКИ
    public static void main(String[] args) {
        Array array  = new Array();
        int [] intNumbers = new int[]{2, 2, 23, 23, 34, 1, -10};
        int maxValue  = array.MaxValue(intNumbers);
        int minValue  = array.MinValue(intNumbers);
        for (int element1: intNumbers) {
            System.out.println(element1);

        }

        System.out.println("Max Value" + maxValue);
        System.out.println("Min Value" + minValue);
    }
}

