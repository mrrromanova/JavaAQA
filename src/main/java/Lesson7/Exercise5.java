package Lesson7;

//5. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

import java.util.Arrays;

public class Exercise5 {
    public static void main(String[] args) {
        int[] ourArray = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println(Arrays.toString(changeArray(ourArray)));
    }
    public static int[] changeArray (int[] array){
        for (int i = 0; i<array.length; i++){
            switch (array[i]){
                case 0:
                    array[i] = 1;
                    break;
                case 1:
                    array[i] = 0;
                    break;
            }
        }
        return array;
    }
}