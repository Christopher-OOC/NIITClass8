package org.example.fx;
import java.util.Scanner;
public class CountInt {

    //Main Method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 3;
        int currentIndexInput = 0;
        int[] inputs = new int[size];
        int input;
        int[] oldInputs;

        System.out.print("Enter any number of integer: ");

        do {
            input = scanner.nextInt();

            if (input == 0) {
                break;
            }
            if ((inputs.length) == currentIndexInput) {
                size = inputs.length * 2;
                oldInputs = inputs;
                inputs = new int[size];

                for (int i = 0; i < oldInputs.length; i++) {
                    inputs[i] = oldInputs[i];
                }
            }

            inputs[currentIndexInput] = input;
            currentIndexInput++;

        } while (input != 0);

        print(inputs);
        // Sort the array
        sortInputs(inputs);
        print(inputs);

        int nonZeroSize = 0;
        // Get actual size
        for (int i = 0; i < inputs.length; i++) {
            if (inputs[i] != 0) {
                nonZeroSize++;
            }
        }
        System.out.println("Actual Size: " + nonZeroSize);

        // removing trailing zeros
        int[] actualInputs = removingZeros(nonZeroSize, inputs);

        print(actualInputs);

        countDigits(actualInputs);
    }
    private static void countDigits(int[] actualInputs) {
        int nextCheckIndex = 0;
        for (int i = 0; i < actualInputs.length; i = nextCheckIndex) {
            int count = 0;
            for (int j = nextCheckIndex; j < actualInputs.length; j++) {
                if (actualInputs[i] == actualInputs[j]) {
                    nextCheckIndex++;
                    count++;
                }
            }

            System.out.println(actualInputs[i] + " occurs " + count + (count > 1 ? " times" : " time"));
        }
    }

    private static int[] removingZeros(int nonZeroSize, int[] inputs) {
        int[] actualInputs = new int[nonZeroSize];
        for (int i = 0, j = 0; i < inputs.length && j < actualInputs.length; i++) {
            if (inputs[i] != 0) {
                actualInputs[j] = inputs[i];
                j++;
            }
        }
        return actualInputs;
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void sortInputs(int[] inputs) {
        for (int i = 0; i < inputs.length - 1; i++) {
            for (int j = 0; j < inputs.length - 1; j++) {
                if (inputs[j] > inputs[j + 1]) {
                    int temp = inputs[j];
                    inputs[j] = inputs[j + 1];
                    inputs[j + 1] = temp;
                }
            }
        }
    }
}
