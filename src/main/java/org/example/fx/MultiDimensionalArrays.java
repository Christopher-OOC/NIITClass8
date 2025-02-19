package org.example.fx;

public class MultiDimensionalArrays {

    public static void main(String[] args) {

        // declaration
        int[][] inputs;
        // initialize
        //inputs = new int[5][5];

        int[][] x = {
                {1, 2, 3},
                {3, 5, 8},
                {6},
                {4, 6}
        };

        int[] ratings = {3, 1, 4};
        int averageRating = (ratings[0] + ratings[1] + ratings[1]) / ratings.length;

        //String[] stateAndCapitals = {"Lagos", "Ikeja", "Ogun", "Abeokuta"};

//        String[][] stateAndCapitals = {
//                {"Lagos", "Ikeja"},
//                {"Ogun", "Abeokuta"}
//        };
//
//        System.out.println("State\t\t\tCapital");
//        System.out.println(stateAndCapitals[0][0] + "\t\t\t" + stateAndCapitals[0][1]);
//        System.out.println(stateAndCapitals[1][0] + "\t\t\t" + stateAndCapitals[1][1]);

        String[][][] port = {
                {
                        {"package1, package2, package3"},
                        {"package4"},
                        {"package5", "package6"}
                },
                {
                        {"package7"},
                        {"package8", "package9"}
                },
                {
                        {"package10"},
                }
        };


    }
}
