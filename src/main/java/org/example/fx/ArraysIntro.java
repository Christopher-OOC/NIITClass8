package org.example.fx;

public class ArraysIntro {

    public static void main(String[] args) {

        // Array declaration
        //int[] integers;

        // Array Initialization
        //integers = new int[10];

        int[] integers = {1, 2, 2};
        integers = new int[2];

        integers[0] = 45;
        System.out.println(integers[0]);

        for (int b : integers) {
            System.out.println(b);
        }



    }
}
