package peex.greatestnumber.ops;

public class ArrayMaxElement implements ArrayOperation<Integer> {
    @Override
    public Integer calculate(int[] arrayOfNumbers) {
        int max = arrayOfNumbers[0];
        for (int num = 1; num < arrayOfNumbers.length; num ++) {
            if (arrayOfNumbers[num] > max) {
                max = arrayOfNumbers[num];
            }
        }
        return max;
    }
}
