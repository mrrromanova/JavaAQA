package Lesson7;

//4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;

public class Exercise4 {
    public static void main(String[] args) {
        String myName = "Меня зовут Лев Николаевич Толстой";
        int t = 5;
        printStringXTimes(myName, t);
    }

    public static void printStringXTimes(String str, int x){
        for (int i = 0; i < x; i++){
            System.out.println(str);
        }
    }
}