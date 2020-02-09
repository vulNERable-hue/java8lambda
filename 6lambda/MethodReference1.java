import java.util.*;

public class MethodReference1 {
    public static void main(String[] args) {
        //Method Reference is a syntactic sugar for lambda expressions
        Thread t = new Thread(MethodReference1::printMessage); //() -> printMessage()
        t.start();
    }
    
    public static void printMessage() {
        System.out.println("Inside thread");
    }
}
