package com.company;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("Задание №1");

        // Задать целочисленный массив, состоящий из элементов 0 и 1
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;

            System.out.print(arr[i] + " ");
        }


        //Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21

            System.out.println("Задание №2");
            int arr1[] = new int[8];
        for (int i = 1, j = 0; i < arr1.length; i++) arr1[i] = j += 3;{
            for (int x : arr1)
                System.out.print(x + " ");
        }

        //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
        // и числа меньшие 6 умножить на 2;
        System.out.println("Задание №3");
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] *= 2;
            } else continue;
            System.out.print(arr2[i] + " ");
        }
        //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        System.out.println("Задание №4");
        int[][] arr3 = new int[3][3];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0, j2 = arr3[i].length; j < arr3[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) arr3[i][j] = 1;
                System.out.print(arr3[i][j] + " ");
            }
        }*/
        //** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        System.out.println("Задание №5");
        int[] arr4 = new int[5];
        int min = arr4[0], max = arr4[0];
        int imin = 0, imax = 0;
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = ((int)(Math.random() * 10));
                if(arr4[i] < min){
                    min = arr4[i];
                    imin = i;
                } else if(arr4[i] > max){
                    max = arr4[i];
                    imax = i;
            }
                System.out.println("Минимальное значение " + min + " у элемента с индексом " + imin);
                System.out.println("Максимальное значение " + max + " у элемента с индексом " + imax);
        }

    }
}



