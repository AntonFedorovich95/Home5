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
        for (int i = 0; i < arrayOne.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arrayOne[i]);
        }
        System.out.println();
        double[] arrayTwo = {1.57, 7.654, 9.986};
        for (int i = 0; i < arrayTwo.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arrayTwo[i]);
        }
        System.out.println();
        int[] arrayThree = {2, 7, 9, 15, 22, 3, 15};
        for (int i = 0; i < arrayThree.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arrayThree[i]);
        }
        System.out.println();
        for (int i = arrayOne.length - 1; i >= 0; i--) {
            if (i != arrayOne.length - 1) {
                System.out.print(", ");
            }
            System.out.print(arrayOne[i]);
        }
        System.out.println();
        for (int i = arrayTwo.length - 1; i >= 0; i--) {
            if (i != arrayTwo.length - 1) {
                System.out.print(", ");
            }
            System.out.print(arrayTwo[i]);
        }
        System.out.println();
        for (int i = arrayThree.length - 1; i >= 0; i--) {
            if (i != arrayThree.length - 1) {
                System.out.print(", ");
            }
            System.out.print(arrayThree[i]);
        }
        System.out.println();
        for (int i = 0; i < arrayOne.length; i++) {
                if (i % 2 == 0 && (i >= 0)) {
                    System.out.print(arrayOne[i] + 1);
                } else
            System.out.print(", " + arrayOne[i] + ", ");
                }
            }
        }