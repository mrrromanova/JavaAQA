package Lesson7;//1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

public class Exersice1 {
    public static boolean checkSum(int a, int b){
        return a + b >= 10 && a + b <= 20;
    }

    public static void main(String[] args) {
        int aa = 11;
        int bb = 11;
        System.out.println(checkSum(aa, bb));
        System.out.println("Hello world");

    }

}