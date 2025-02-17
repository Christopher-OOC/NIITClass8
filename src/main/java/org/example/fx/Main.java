package org.example.fx;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter values for a, b, and c
        System.out.print("Enter the value for a: ");
        double a = input.nextDouble();

        System.out.print("Enter the value for b: ");
        double b = input.nextDouble();

        System.out.print("Enter the value for c: ");
        double c = input.nextDouble();

        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // Check the value of the discriminant
        if (discriminant > 0) {
            // Two distinct real roots
            double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("The equation has two real roots: %.2f and %.2f%n", r1, r2);
        } else if (discriminant == 0) {
            // One real root (repeated)
            double r = (-b) / (2 * a);
            System.out.printf("The equation has one real root: %.2f%n", r);
        } else {
            String realPart = String.format("%.2f", (-b / (2 * a)));
            String imagenaryPart = String.format("%.2f", (Math.sqrt(Math.abs(discriminant)) / (2 * a)));
            String r1 = realPart + " + " + imagenaryPart + "i";
            String r2 = realPart + " - " + imagenaryPart + "i";
            System.out.printf("The equation has two imaginary roots: %s and %s", r1, r2);
        }

        input.close();
    }
}