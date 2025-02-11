package org.example.fx;
import java.util.Scanner;
public class CountInt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 3;
        int currentIndexInput = 0;
        int[] inputs = new int[size];
        int input;
        int[] oldInputs = new int[size];

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

        System.out.println("The program stops! when you enter 0");
        System.out.println("OldInputs: " + oldInputs.length);
        System.out.println("Inputs: " + inputs.length);
    }
}
