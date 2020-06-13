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


// Before Lambda's - old way of doing

/*
Greeting greet = new Greeting() {
    @override
    public void perform() {
        System.out.println("Hello World Lambda');
    }
}
*/
