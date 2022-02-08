package ru.skypro;

public class Main {

    public static void main(String[] args) {
        int[] arrayOne = new int[3];
        arrayOne[0] = 1;
        int one = arrayOne[0];
        arrayOne[1] = 2;
        int two = arrayOne[1];
        arrayOne[2] = 3;
        int three = arrayOne[2];
        for (int i = 0; i < 2; i++) {
            System.out.print(arrayOne[i] + ", ");
        }
        System.out.print(arrayOne[2]);
        System.out.println();
        double[] arrayTwo = {1.57, 7.654, 9.986};
        for (int i = 0; i < 2; i++) {
            System.out.print(arrayTwo[i] + ", ");
        }
        System.out.print(arrayTwo[2]);
        System.out.println();
        int[] arrayThree = {2, 7, 9, 15, 22, 3, 15};
        for (int i = 0; i < 6; i++) {
            System.out.print(arrayThree[i] + ", ");
        }
        System.out.print(arrayThree[6]);
        System.out.println();
        for (int i = 2; i > 0; i--) {
            System.out.print(arrayOne[i] + ", ");
        }
        System.out.print(arrayOne[0]);
        System.out.println();
        for (int i = 2; i > 0; i--) {
            System.out.print(arrayTwo[i] + ", ");
        }
        System.out.print(arrayTwo[0]);
        System.out.println();
        for (int i = 6; i > 0; i--) {
            System.out.print(arrayThree[i] + ", ");
        }
        System.out.print(arrayThree[0]);
        System.out.println();
        for (int i = 0; i < arrayOne.length; i++) {
            if (i % 2 == 0) {
                System.out.print(arrayOne[i] + 1 + " ");
            } else {
                System.out.print(arrayOne[i] + " ");
            }
        }
    }
}
