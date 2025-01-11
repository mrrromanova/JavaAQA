package Lesson7;

//9.* Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

import java.util.Arrays;

public class Exercise9 {
    public static void main(String[] args) {
        int a = 8;
        int b = 9;
        System.out.println(Arrays.toString(newArray(a, b)));
    }

    public static int[] newArray (int len, int initialValue){
        int [] array = new int [len];
        Arrays.fill(array, initialValue);
        return array;
    }
}