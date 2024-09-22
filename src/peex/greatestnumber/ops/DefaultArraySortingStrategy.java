package peex.greatestnumber.ops;

import java.util.Arrays;

public class DefaultArraySortingStrategy implements ArraySortingStrategy {
    @Override
    public int[] sorted(int[] array) {
        int[] result = Arrays.copyOf(array, array.length);
        Arrays.sort(result);
        return result;
    }

}
