package Lesson7;

//3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное. Замечание: ноль считаем положительным числом.

public class Exercise3 {

    public static void main(String[] args) {
        int num = -20;
        System.out.println(positiveOrNegative(num));
    }

    public static boolean positiveOrNegative (int x){
        return x < 0;
    }
}