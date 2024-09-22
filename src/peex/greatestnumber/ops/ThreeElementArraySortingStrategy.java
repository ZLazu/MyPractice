package peex.greatestnumber.ops;

import java.util.Arrays;

public class ThreeElementArraySortingStrategy implements ArraySortingStrategy{
    @Override
    public int[] sorted(int[] array) {
        if(array.length != 3){
            throw new IllegalArgumentException("Array size is not 3!");
        }

        int[] arrayOfNumbers = new int[array.length];
        for (int num = 0; num < array.length; num++)
            arrayOfNumbers[num] = array[num];

        int temp;
        if (arrayOfNumbers[0] >= arrayOfNumbers[1] && arrayOfNumbers[0] >= arrayOfNumbers[2] && arrayOfNumbers[1] >= arrayOfNumbers[2]) {
            temp = arrayOfNumbers[0];
            arrayOfNumbers[0] = arrayOfNumbers[2];
            arrayOfNumbers[2] = temp;
        }
        if (arrayOfNumbers[0] >= arrayOfNumbers[2] && arrayOfNumbers[1] <= arrayOfNumbers[2]) {
            temp = arrayOfNumbers[0];
            arrayOfNumbers[0] = arrayOfNumbers[1];
            arrayOfNumbers[1] = arrayOfNumbers[2];
            arrayOfNumbers[2] = temp;
        }
        if (arrayOfNumbers[1] >= arrayOfNumbers[0] && arrayOfNumbers[1] >= arrayOfNumbers[2]&& arrayOfNumbers[0] >= arrayOfNumbers[2]) {
            temp = arrayOfNumbers[1];
            arrayOfNumbers[1] = arrayOfNumbers[0];
            arrayOfNumbers[0] = arrayOfNumbers[2];
            arrayOfNumbers[2] = temp;
        }
        if (arrayOfNumbers[1] >= arrayOfNumbers[2]) {
            temp = arrayOfNumbers[1];
            arrayOfNumbers[1] = arrayOfNumbers[2];
            arrayOfNumbers[2] = temp;
        }
        if (arrayOfNumbers[0] >= arrayOfNumbers[1]) {
            temp = arrayOfNumbers[1];
            arrayOfNumbers[1] = arrayOfNumbers[0];
            arrayOfNumbers[0] = temp;
        }
        System.out.println("\nMy sortedd array: ");
        System.out.println(Arrays.toString(arrayOfNumbers));
        return arrayOfNumbers;
    }

}
