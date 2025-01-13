package Lesson9.Pets;

public class Cat extends Pet{

    private String name;
    private static int count = 0;
    private static boolean satiety = false;

    public static int getCount() {
        return count;
    }

    public Cat(String name) {
        this.name = name;
        count++;
    }
    public Cat() {
        count++;
    }


    @Override
    public void run(int distance) {
        if (distance > 0 && distance <= 200) {
            super.run(distance);
            System.out.println("Кот " + name + " пробежал " + distance + " м.");
            satiety = false;
        }
        else if (distance > 200) {
            System.out.println("Увы, но котик может пробежать не больше 200 метров.");
        }
        else {
            System.out.println("Неверное значение.");
        }

    }

    @Override
    public void swim() {
        System.out.println("Котик не умеет плавать(");;
    }

    public void eat(Bowl bowl, int quantity){
        if (Cat.satiety){
            System.out.println("Кот уже сыт.");
            satiety = true;
        }
        else if ((bowl.capacity - quantity) < 0){
            System.out.println("В миске недостаточно еды.");
            satiety = false;
        }
        else {
            bowl.capacity -= quantity;
            System.out.println("Кот успешно покушал.");
            satiety = true;
        }
    }
}