import java.util.*;

public class RunnableApp {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                System.out.println("printed by thread");
            }
        });
        thread.run();
        
        Thread thread2 = new Thread(() -> {
            System.out.println("printed by thread using lambda");
        });
        thread2.run();
    }
}
