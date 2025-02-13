package Lesson7;

//6. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

import java.util.Arrays;

public class Exercise6 {
    public static void main(String[] args) {
        int [] emptyArray = new int[100];
        System.out.println(Arrays.toString(fillArray(emptyArray)));
    }

    public static int[] fillArray (int [] array){
        for(int i = 0; i<array.length; i++){
            array[i] = i+1;
        }
        return array;
    }
}