public class main {

    public static void main(String[] args) {

        Car myToyotaCar = new Car();
        myToyotaCar.setSeats(Constant.SEATS)
                .setBrand(Constant.TOYOTA)
                .setWheels(Constant.WHEELS)
                .setDoors(Constant.DOORS)
                .setMaxSpeed(100);
        myToyotaCar.info();

        Car myBmwCar = new Car();
        myBmwCar.setSeats(Constant.SEATS)
                .setBrand(Constant.BMW)
                .setWheels(Constant.WHEELS)
                .setDoors(Constant.DOORS)
                .setMaxSpeed(200);
        myBmwCar.info();

        myToyotaCar.run();
        myBmwCar.run();
    }
}
