public class Vehicle {

    protected String brand;

    protected int wheels;
    protected int doors;

    protected int maxSpeed;

    public Vehicle setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getBrand() {
        return this.brand;
    }

    public Vehicle setWheels(int wheels) {
        this.wheels = wheels;
        return this;
    }

    public int getWheels() {
        return this.wheels;
    }

    public Vehicle setDoors(int doors) {
        this.doors = doors;
        return this;
    }

    public int getDoors() {
        return this.doors;
    }

    public Vehicle setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public Vehicle info() {
        System.out.println("brand = " + getBrand());
        System.out.println("wheels = " + getWheels());
        System.out.println("doors = " + getDoors());
        System.out.println("maxSpeed = " + getMaxSpeed());
        return this;
    }

    public void run() {
        for (int i = 0; i < Constant.RUN_TIMES; i++) {
            System.out.println(getMaxSpeed());
        }
    }
}
