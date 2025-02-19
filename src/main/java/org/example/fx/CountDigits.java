package org.example.fx;

import java.util.Random;

public class CountDigits {
    public static void main(String[] args) throws InterruptedException {

        Random random = new Random();
        int[] numbers = new int[100];
        int[] counts = new int[10];
        int countNumber = 1;

        System.out.println("Generating numbers...");
        for (int i = 0; i < numbers.length; i++) {
            int rand = random.nextInt(10);
            numbers[i] = rand;

            if (countNumber % 10 == 0) {
                System.out.println(rand + "  ");
            }
            else {
                System.out.print(rand + "  ");
            }
            countNumber++;
            //Thread.sleep(100);
        }

        for (int k = 0; k < counts.length; k++) {
            for (int j = 0; j < numbers.length; j++) {
                if (k == numbers[j]) {
                    counts[k] = counts[k] + 1;
                }
            }
        }

        System.out.println();

        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + " appears " + counts[i] + (counts[i] > 1 ? " times" : " time"));
        }
    }
}
