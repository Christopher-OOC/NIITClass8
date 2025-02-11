package org.example.fx;

import java.util.Random;

public class SumOfIntegers {

    public static void main(String[] args) {

        int[] numbers = new int[100];
        int sum = 0;

        // Initialization of values
        for (int i = 0; i <= numbers.length; i++) {
            numbers[i] = new Random().nextInt(10);
        }

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("The sum is: " + sum);
    }
}
