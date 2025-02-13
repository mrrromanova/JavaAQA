package Lesson7;

//* Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

public class Exercise11 {
    public static void main(String[] args) {
        System.out.println(isLeapYear(100));
    }
    public static boolean isLeapYear (int n){
        boolean flag;

        if (n % 4 == 0 && n % 100 != 0){
            return true;
        }
        return n % 400 == 0;
    }
}