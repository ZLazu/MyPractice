package peex.greatestnumber.input;

import java.util.Random;

public class RandomArrayProvider implements ArrayProvider {

    @Override
    public int[] provideArray() {
        int arrayLength = 3;
        int[] result = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < arrayLength; i++) {
            result[i] = random.nextInt(100);
        }
        return result;
    }
}
