import java.util.*;

public class ThisReference1 {
    public static void main(String[] args) {
        ThisReference1 thisReference = new ThisReference1();
        thisReference.doProcess(10, new Process() {
            @Override
            public void process(int a) {
                System.out.println(a);
                System.out.println(this); //this refers to the inner Process class
            }
            @Override
            public String toString() {
                return "This is anonymous inner Process class";
            }
        });
    }
    public void doProcess(int a, Process p) {
        p.process(a);
    }
}

interface Process {
    public void process(int a);
}
