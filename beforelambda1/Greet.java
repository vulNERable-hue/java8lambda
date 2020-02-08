import java.util.*;

public class Greet {
    public void greet(Greeting greeting) {
        greeting.perform();
    }
    
    public static void main(String[] args) {
        Greet app = new Greet();   
        
        Greeting greeting = new HelloWorldGreeting();
        app.greet(greeting);
    }
}
