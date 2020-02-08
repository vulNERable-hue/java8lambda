import java.util.*;

public class Greet {
    public void greet(Greeting greeting) {
        greeting.perform();
    }
    
    public static void main(String[] args) {
        Greet app = new Greet();   
        
        Greeting helloWorldGreeting = new Greeting() {
            public void perform() {
                System.out.println("Hello World!!");
            }
        };
        
        app.greet(helloWorldGreeting);
    }
}
