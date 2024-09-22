package peex.greatestnumber.input;

import java.util.Scanner;

public class UserInputArrayProvider implements ArrayProvider{
    @Override
    public int[] provideArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1 = scanner.nextInt();
        System.out.println("Enter the first number");
        int number2 = scanner.nextInt();
        System.out.println("Enter the third number");
        int number3 = scanner.nextInt();
        scanner.close();
        int[] array = {number1, number2, number3};
        return array;
    }
}
