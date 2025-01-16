package Lesson10;

import java.util.Arrays;

public class ChangeArray {

    public static void main(String[] args) {
    String[] firstArray = {"qwe", "rty", "uio"};
    String[] secondArray = {"asd", "fgh", "jkl"};
    String temp = firstArray[0];
    firstArray[0] = secondArray[0];
    secondArray[0] = temp;
    System.out.println(Arrays.toString(firstArray));
    System.out.println(Arrays.toString(secondArray));
    }
}
