public class Car extends Vehicle {

    private int seats;

    public Car setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    public int getSeats() {
        return this.seats;
    }

    public Car info() {
        System.out.println("brand = " + getBrand());
        System.out.println("wheels = " + getWheels());
        System.out.println("doors = " + getDoors());
        System.out.println("seats = " + getSeats());
        System.out.println("maxSpeed = " + getMaxSpeed());
        return this;
    }

}
