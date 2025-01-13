package Lesson9.Park;

public class ParkMain
{
    public static void main(String[] args) {
        Park park = new Park("SixFlags", "Santa Clara, California");
        Park.amusementRide carousel = park.new amusementRide("Carousel", "10 - 20", 20 );
        carousel.getInfoAmusementRide();
        park.getInfoPark();
    }
}

