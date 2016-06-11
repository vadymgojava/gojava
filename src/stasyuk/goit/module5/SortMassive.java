package stasyuk.goit.module5;

// метод bubble sort

import java.util.List;

public class SortMassive {

    public int [] sort (int[] intArray) {

        boolean switchOccurred = true;


        while (switchOccurred) {
            switchOccurred = false;
            for (int i = 0; i < intArray.length - 1; i++) {
                if (intArray[i] < intArray[i + 1]) {

                    int tempInteger = intArray[i];
                    intArray[i] = intArray[i + 1];
                    intArray[i + 1] = tempInteger;
                    switchOccurred = true;
                }

            }
        }
        return intArray;

    }
//  ЭТО МЕТОД ЧИСТО ДЛЯ ПРОВЕРКИ
    public static void main(String[] args) {
        SortMassive sortMassive = new SortMassive();
        int[] intArray = new int[]{2, 32, 12, 1, -12};
        for (int element : sortMassive.sort(intArray)) {
            System.out.println(element);
        }


    }
}