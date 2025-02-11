package org.example.fx;

public class VariableArrays {

    public static void main(String[] args) {
        System.out.println("max: " + max(5, 10, 15, 2, 23456, 123456, 123));
    }

    public static int max(int... inputs) {
        int max = inputs[0];
        for (int i = 1; i < inputs.length; i++) {
            if (inputs[i] > max) {
                max = inputs[i];
            }
        }

        return max;
     }

    public static int max(int n1, int n2) {
        return n1 >= n2 ? n1 : n2;
    }
}
