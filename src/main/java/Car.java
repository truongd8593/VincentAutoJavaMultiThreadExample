public class Car extends Vehicle implements Runnable {

    private int seats;

    public Car setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    public int getSeats() {
        return this.seats;
    }

    public Car info() {
        super.info();
        System.out.println("seats = " + getSeats());
        return this;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName()
                + ", executing run() method!");
        for (int i = 0; i < Constant.RUN_TIMES; i++) {
            System.out.println(getMaxSpeed());
        }
    }

}
