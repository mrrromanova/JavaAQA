package Lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Box <T extends Fruit>{

    ArrayList<T> box = new ArrayList<>();
    int count = 0;
    private Class<T> type;

    public Class<?> getType() {
        return this.type;
    }

    public ArrayList<T> getBox() {
        return box;
    }

    public void add(T fruit){
        box.add(fruit);
        count ++;
        System.out.println("Fruit was added. Box contain " + count + " fruit(s).");
    }

    public float getWeight(){
        float sumWeight = 0;
        for (T fruit: box){
            sumWeight += fruit.getWeight();
        }
        return sumWeight;
        }

        public void compare(Box <?> boxToCompare){
        float sumWeightBoxOne = 0;
        for (T fruit: box){
            sumWeightBoxOne += fruit.getWeight();
        }

        if (sumWeightBoxOne == boxToCompare.getWeight()){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
