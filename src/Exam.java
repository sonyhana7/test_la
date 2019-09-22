import java.util.concurrent.CyclicBarrier;

public class Exam implements Runnable {

    private int id;
    CyclicBarrier cyclicBarrier;

    public Exam(int id, CyclicBarrier cyclicBarrier) {
        this.id = id;
        this.cyclicBarrier = cyclicBarrier;

    }

    public void run() {
        System.out.println(id + " Starts the exam...");
        try {
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
