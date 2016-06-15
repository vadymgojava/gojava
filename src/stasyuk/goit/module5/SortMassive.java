package stasyuk.goit.module5;

// метод bubble sort


public class SortMassive {

    public static int [] sort (int[] intArray) {

        if (intArray.length==1) throw new IllegalStateException("There is nothing to sort, sorry");

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




}