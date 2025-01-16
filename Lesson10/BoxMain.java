package Lesson10;

public class BoxMain {

    public static void main(String[] args) {

        Box <Apple> boxApple= new Box<>();
        Box <Orange> boxOrange= new Box<>();

        boxApple.add(new Apple());
        boxApple.add(new Apple());
        boxApple.add(new Apple());
        //System.out.println("Box weight is " + boxApple.getWeight());

        boxOrange.add(new Orange());
        boxOrange.add(new Orange());
        //System.out.println("Box weight is " + boxOrange.getWeight());

        boxOrange.compare(boxApple);
    }
}
