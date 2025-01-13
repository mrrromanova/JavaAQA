package Lesson9.Pets;

public class Dog extends Pet {

    String name;
    private static int count = 0;

    public static int getCount() {
        return count;
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog() {
    }

    @Override
    public void run(int distance) {
        if (distance > 0 && distance <= 500) {
            super.run(distance);
            System.out.println("Собака по имени" + name + " пробежал " + distance + " м.");
        }
        else if (distance > 500) {
            System.out.println("Увы, но собака может пробежать не больше 500 метров.");
        }
        else {
            System.out.println("Неверное значение.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance > 0 && distance <= 10) {
            super.swim(distance);
            System.out.println("Собака по имени " + name + " проплыл " + distance + " м.");
        }
        else if (distance > 10) {
            System.out.println("Увы, но собака не может проплыть больше 10 метров. ");
        }
        else{
            System.out.println("Неверное значение.");
        }
    }
}