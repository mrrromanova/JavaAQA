package Lesson9.Pets;

public class Bowl {
    int capacity = 0;
    Bowl(int capacity){
        if (capacity >= 0){
            this.capacity=+capacity;
        }
        else {
            System.out.println("В миске не больше быть еды меньше 0");
        }
    }

    Bowl(){

    }

    public void fillTheBowl (int quantity){
        this.capacity += quantity;
    }
}