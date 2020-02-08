import java.util.*;

public class Greet {
    public void greet(Greeting greeting) {
        greeting.perform();
    }
    
    public static void main(String[] args) {
        Greet app = new Greet();
        
        Greeting helloWorldGreeting = () -> System.out.println("Hello World lambda");
        app.greet(helloWorldGreeting);
//      or  app.greet(() -> System.out.println("Hello World lambda"));
    }
}
