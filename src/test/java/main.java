public class main {

    public static void main(String[] args) {

        // Question 1
        System.out.println("Question 1's output");
        System.out.println(Constant.LINE_BREAK);
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

        System.out.println(Constant.LINE_BREAK);

        myToyotaCar.run();
        myBmwCar.run();

        // Question 2
//        System.out.println(Constant.LINE_BREAK);
//        System.out.println("Question 2's output");
//        System.out.println(Constant.LINE_BREAK);
//        Thread toyotaThread = new Thread(myToyotaCar);
//        toyotaThread.start();
//        Thread bmwThread = new Thread(myBmwCar);
//        bmwThread.start();

        // Question 4
        System.out.println(Constant.LINE_BREAK);
        System.out.println("Question 4's output");
        System.out.println(Constant.LINE_BREAK);
        ConcurrentCar myNewToyotaCar = new ConcurrentCar();
        ConcurrentCar myNewBmwCar = new ConcurrentCar();
        myNewToyotaCar.setSeats(Constant.SEATS)
                .setBrand(Constant.TOYOTA)
                .setWheels(Constant.WHEELS)
                .setDoors(Constant.DOORS)
                .setMaxSpeed(100);
        myNewToyotaCar.info();
        myNewBmwCar.setSeats(Constant.SEATS)
                .setBrand(Constant.BMW)
                .setWheels(Constant.WHEELS)
                .setDoors(Constant.DOORS)
                .setMaxSpeed(200);
        myNewBmwCar.info();

        Thread toyotaConcurrentThread = new Thread(myNewToyotaCar);
        toyotaConcurrentThread.start();
        Thread bmwConcurrentThread = new Thread(myNewBmwCar);
        bmwConcurrentThread.start();

    }
}
