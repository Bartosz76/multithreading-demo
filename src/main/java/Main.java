import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.submit(() -> {
            goThroughTheLoop();
        });
        executorService.submit(() -> {
            goThroughTheLoop();
        });
        

    }

    public static void goThroughTheLoop () {
        for (int i = 0; i < 99; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

}
