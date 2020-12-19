import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrentCar extends Car implements Runnable {

    final Lock lock = new ReentrantLock(true);

    public void run() {
        for (int i = 0; i < Constant.RUN_TIMES; i++) {
            lock.lock();
            System.out.println(getMaxSpeed());
            lock.unlock();
        }
    }

}
