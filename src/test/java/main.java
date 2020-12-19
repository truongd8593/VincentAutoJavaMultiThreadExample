public class main {

    private static final String toyotaBrand = "Toyota";
    private static final String bmwBrand = "BMW";

    private static final int wheels = 4;
    private static final int doors = 4;
    private static final int seats = 5;

    public static void main(String[] args) {

        Car myToyotaCar = new Car();
        myToyotaCar.setSeats(seats)
                .setBrand(toyotaBrand)
                .setWheels(wheels)
                .setDoors(doors);

        Car myBmwCar = new Car();
        myToyotaCar.setSeats(seats)
                .setBrand(bmwBrand)
                .setWheels(wheels)
                .setDoors(doors);
    }
}
