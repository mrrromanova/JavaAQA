package Lesson13;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Minsk");
        list.add("Vitsyebsk");
        list.add("Mahilyow");
        list.add("Minsk");
        list.add("Homyel");
        list.add("Minsk");
        list.add("Brest");
        list.add("Brest");
        list.add("Mahilyow");
        list.add("Hrodna");
        list.add("Minsk");
        list.add("Hrodna");
        list.add("Hrodna");

        System.out.println(list);
        Map<String, Integer> mapOfStrings = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            boolean flag = true;
            int num = 1;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j)) && i != j) {
                    flag = false;
                    num++;
                }
            }
            mapOfStrings.put(list.get(i), num);
            if (flag) {
                System.out.println(list.get(i) + " is unique string");
            }
        }
        System.out.println(mapOfStrings);

    }
}