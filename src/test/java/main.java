import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class main {

    private Car myToyotaCar = new Car();
    private Car myBmwCar = new Car();

    private Thread toyotaThread = new Thread(myToyotaCar);
    private Thread bmwThread = new Thread(myBmwCar);

    private ConcurrentCar myNewToyotaCar = new ConcurrentCar();
    private ConcurrentCar myNewBmwCar = new ConcurrentCar();

    private Thread toyotaConcurrentThread = new Thread(myNewToyotaCar);
    private Thread bmwConcurrentThread = new Thread(myNewBmwCar);

    @BeforeClass
    public void setUp() {

        myToyotaCar.setSeats(Constant.SEATS)
                .setBrand(Constant.TOYOTA)
                .setWheels(Constant.WHEELS)
                .setDoors(Constant.DOORS)
                .setMaxSpeed(100);

        myBmwCar.setSeats(Constant.SEATS)
                .setBrand(Constant.BMW)
                .setWheels(Constant.WHEELS)
                .setDoors(Constant.DOORS)
                .setMaxSpeed(200);

        myNewToyotaCar.setSeats(Constant.SEATS)
                .setBrand(Constant.TOYOTA)
                .setWheels(Constant.WHEELS)
                .setDoors(Constant.DOORS)
                .setMaxSpeed(100);

        myNewBmwCar.setSeats(Constant.SEATS)
                .setBrand(Constant.BMW)
                .setWheels(Constant.WHEELS)
                .setDoors(Constant.DOORS)
                .setMaxSpeed(200);
    }

    @Test(priority = 0)
    public void questionOne() {
        System.out.println("Question 1's output");
        System.out.println(Constant.LINE_BREAK);

        myToyotaCar.info();
        myBmwCar.info();

        System.out.println(Constant.LINE_BREAK);

        myToyotaCar.run();
        myBmwCar.run();
    }

    @Test(priority = 1)
    public void questionTwoAndThree() throws InterruptedException {
        System.out.println(Constant.LINE_BREAK);
        System.out.println("Question 2's output");
        System.out.println(Constant.LINE_BREAK);

        toyotaThread.start();
        Thread.sleep(10);
        bmwThread.start();
    }

    @Test(priority = 2)
    public void questionFour() throws InterruptedException {
        System.out.println(Constant.LINE_BREAK);
        System.out.println("Question 4's output");
        System.out.println(Constant.LINE_BREAK);

        myNewToyotaCar.info();
        myNewBmwCar.info();

        toyotaConcurrentThread.start();
        bmwConcurrentThread.start();
    }

}
