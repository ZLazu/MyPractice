package peex.greatestnumber;

import peex.greatestnumber.input.ArrayProvider;
import peex.greatestnumber.input.RandomArrayProvider;
import peex.greatestnumber.input.UserInputArrayProvider;
import peex.greatestnumber.ops.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        System.out.println("\nPress Y, if you want to write an array. Press N, if you want a random array to be created");
        int[] arrayReceived = getArray();

        System.out.println("\nReceived array: ");
        System.out.println(Arrays.toString(arrayReceived));

        Map<String, ArrayOperation<? extends Object>> availableOperations = new HashMap<>();
        availableOperations.put("Default sort", new DefaultArraySortingStrategy());
        availableOperations.put("Bubble Sort", new BubbleSort());
        availableOperations.put("Three element sort", new ThreeElementArraySortingStrategy());
        availableOperations.put("Greatest element", new ArrayMaxElement());

        // Sort the array using my method and print result
        int[] arrayOrderedByCustomMethod = (int[]) availableOperations.get("Three element sort").calculate(arrayReceived);
        System.out.println("\nThe sorted array is by my method: ");
        System.out.println(String.format("The first number is %d the second number is %d the third number %d ", arrayOrderedByCustomMethod[0], arrayOrderedByCustomMethod[1], arrayOrderedByCustomMethod[2]));

        // Sort the array using bubble sort
        int[] arrayOrderedByBubbleMethod = (int[]) availableOperations.get("Bubble Sort").calculate(arrayReceived);
        System.out.println("\nThe array sorted by Bubble Sort: ");
        System.out.println(Arrays.toString(arrayOrderedByBubbleMethod));

        // Sort the array using utility method and print result
        int[] arrayOrderedByDefaultMethod = (int[]) availableOperations.get("Default sort").calculate(arrayReceived);
        System.out.println("\nThe sorted array is by utility default method: ");
        for (int num : arrayOrderedByDefaultMethod) {
            System.out.print(num + " ");
        }
        //Find max value
        Object maxMy = availableOperations.get("Greatest element").calculate(arrayReceived);
        System.out.printf("\n \nThe biggest number is %d %n", (int) maxMy);
    }

    private static int[] getArray() {
        Scanner scanner = new Scanner(System.in);
        char answer = scanner.next().charAt(0);
        ArrayProvider provider;
        switch (answer){
            case 'Y':  provider = new UserInputArrayProvider();
            break;
            case 'N':
            default: provider = new RandomArrayProvider();
        }

        //Get random array
        //ArrayProvider provider = new RandomArrayProvider();
        //int[] arrayReceived = provider.provideArray();

        //Get array from a user
        //ArrayProvider provider = new UserInputArrayProvider();
        int[] arrayReceived = provider.provideArray();
        return arrayReceived;
    }
}
