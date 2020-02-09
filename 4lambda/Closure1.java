import java.util.*;

public class Closure1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20; //this has to be final var, in java8 no need to explicitly declare it as final
        
        doProcess(a, new Process() {
            @Override
            public void process(int a) {
                System.out.println(a + b); //b is refrenced through closure!
            }
        });
        
//        b = 40; //error: local variables referenced from an inner class must be final or effectively final
    }
    
    public static void doProcess(int a, Process p) {
        p.process(a);
    }
}

interface Process {
    public void process(int a);
}
