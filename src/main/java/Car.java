public class Car extends Vehicle {

    private int seats;

    public Car setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    public int getSeats() {
        return this.seats;
    }

}
