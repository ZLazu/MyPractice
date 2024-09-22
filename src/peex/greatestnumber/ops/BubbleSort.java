package peex.greatestnumber.ops;

import java.util.Arrays;

public class BubbleSort implements ArraySortingStrategy {
    @Override
    public int[] sorted(int[] array) {
        int[] result = Arrays.copyOf(array, array.length);
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = 1; j < result.length; j++) {
                if (result[i] > result[j]) {
                    int temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        return result;
    }
}
