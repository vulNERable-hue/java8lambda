import java.util.*;

public class CollectionIteration {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Bob", 32),
            new Person("Alex", 21),
            new Person("Jason", 28),
            new Person("Carl", 35),
            new Person("Arin", 25)
        );
        
        //External iteration - for in loop
        System.out.println("for in loop");
        for (Person p : people) { 
            System.out.println(p);
        }
        
        //Internal iteration - for each loop
        System.out.println("for each loop");
        people.forEach(p -> System.out.println(p));
                
    }   
}
