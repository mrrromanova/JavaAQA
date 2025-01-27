package Lesson13;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PhoneBook {

    private final Map <Long, String> phonebook = new HashMap<>();

    public void get(String surname) {
        for (Map.Entry<Long, String> map : phonebook.entrySet()) {
            if (Objects.equals(map.getValue(), surname)){
                System.out.println(map.getValue() + ": " + map.getKey());
            }
        }
    }

    public void add (Long number, String surname) {
        this.phonebook.put(number, surname);
    }

    public static void main(String[] args) {
        
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(375295786374L, "Smith");
        phoneBook.add(375532643748L, "Brown");
        phoneBook.add(375629474984L, "Jones");
        phoneBook.add(375637482748L, "Garcia");
        phoneBook.add(375637349404L, "Miller");
        phoneBook.add(374648348463L, "Brown");
        phoneBook.add(356348293745L, "Garcia");

        phoneBook.get("Brown");

    }
}

