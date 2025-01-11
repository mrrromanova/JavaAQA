package Lesson7;

//8. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

import java.util.Arrays;

public class Exercise8 {
    public static void main(String[] args) {
        int num = 8;
        int[][] doubleArray = new int[num][num];
        int[][] newArray = diagonalArray(doubleArray);
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(Arrays.toString(newArray[i]));
        }

    }

    public static int[][] diagonalArray (int[][] array){
        for (int i = 0; i<array.length; i++){
            array[i][i] = 1;
        }
        for (int i = 0; i<array.length; i++){
            array[i][array.length - 1 - i] = 1;
        }
        return array;
    }
}