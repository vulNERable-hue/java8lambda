import java.util.*;

public class Closure2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20; //effectively final!
        
        doProcess(a, (e) -> { System.out.println(e + b); });  
        
//        b = 40;   //not allowed
    }
    
    public static void doProcess(int a, Process p) {
        p.process(a);
    }
}

interface Process {
    public void process(int e);
}
