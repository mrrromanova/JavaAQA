package Lesson7;//2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

public class Exercise2 {

    public static void main(String[] args) {
        positiveOrNegative(20);
    }

    public static void positiveOrNegative (int x){
        if (x < 0){
            System.out.println("Число отрицательное");
        }
        else
            System.out.println("Число положительное");
    }
}
