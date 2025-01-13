package Lesson9.Pets;

public class PetMain {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик");
        Dog dog1 = new Dog("Мухтар");
        Bowl bowl1 = new Bowl(30);

        System.out.println(Cat.getCount());

        cat1.eat(bowl1, 25);
        System.out.println(bowl1.capacity);
        bowl1.fillTheBowl(10);
        cat1.eat(bowl1, 15);
    }
}