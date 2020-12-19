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

    public Vehicle setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void run() {

    }
}
