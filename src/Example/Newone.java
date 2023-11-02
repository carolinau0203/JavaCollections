package Example;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;

public class Newone {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = random.nextInt(100000);
        }
        System.out.println(Arrays.toString(numbers));
        selectionSort (numbers);
        System.out.println(Arrays.toString(numbers));

    }

    private static void selectionSort(int[] numbers) {
    }
}
