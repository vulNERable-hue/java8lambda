import java.util.*;

public class ThisReference2 {
    
    public static void main(String[] args) {
        
        ThisReference2 thisReference = new ThisReference2();
        
        thisReference.doProcess(10, a -> {
            System.out.println(a);
           // System.out.println(this); 
           // error: non-static variable this cannot be referenced from a static context
           // this refers to object of ThisReference2 type
        });
        
        thisReference.execute();
    }
    
    public void doProcess(int a, Process p) {
        p.process(a);
    }
    
    public void execute() {
        // value of this inside lambda is equal to value of this here
        System.out.println("value of this outside lambda: " + this);
        doProcess(10, a -> {
            System.out.println(a);
            System.out.println("value of this inside lambda: " + this); 
            // this here refers to the instance on which the lambda is called
        });
    }
    
    @Override
    public String toString() {
        return "Object of type ThisReference2";
    }
}

interface Process {
    public void process(int a);
}
