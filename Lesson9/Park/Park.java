package Lesson9.Park;

import java.text.SimpleDateFormat;

public class Park {

    String location;
    String name;

    public Park(String name, String location){
        this.name = name;
        this.location = location;
    }

    public Park(){

    }

    public void getInfoPark(){
        System.out.println("Name: " + name + ", Address: " + location);
    }

    public class amusementRide{
        String name;
        String openHours;
        int  price;

        public amusementRide(String name, String openHours, int price){
            this.name = name;
            this.openHours = openHours;
            this.price = price;
        }

        public amusementRide(){

        }

        public void getInfoAmusementRide(){
             System.out.println("Name: " + name + ", Open Hours: " + openHours + ", Price for one person: " + price);
         }
    }

}
