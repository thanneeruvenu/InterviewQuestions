package corejava.threads;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, ()-> System.out.println("Lets Play!"));

        Runnable r = () -> {
          System.out.println("Running !!!");
            try {
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        };

        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();

       // System.out.println("End Main !!");

    }
}
