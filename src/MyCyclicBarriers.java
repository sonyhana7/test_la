import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class MyCyclicBarriers {

    public static void main(String[] args) {
        ExecutorService executorService = Executor.newFixedThreadPool(3);
        CyclicBarrier barrier = new CyclicBarrier(3, new Runnable() {
            @Override
            public void run() {
                System.out.println("We will pass this exam...");
            }
        });

        for (int i = 0; i < 3; ++i) {
            executorService.execute(new Exam(i + 1; barrier));

        } executorService.shutdown();))





