import java.util.*;

public class Exercise1Lambda {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Bob", 32),
            new Person("Alex", 21),
            new Person("Jason", 28),
            new Person("Carl", 35),
            new Person("Arin", 25)
        );
        
        //1. sort people by name
        Collections.sort(people, (p1, p2) -> p1.getName().compareTo(p2.getName()));
        
        //2. method to print people
        System.out.println("Print all persons");
        printConditionally(people, (p, c) -> true, "");
        
        //3. method to print people whose name start with C
        System.out.println("Print people whose name starts with C");
        printConditionally(people, (p, c) -> p.getName().startsWith(c), "C");
        
        System.out.println("Print conditionally - name starts with A");
        printConditionally(people, (p, c) -> p.getName().startsWith(c), "A");
        
        System.out.println("Print conditionally - age greater than 25");
        printConditionally(people, (p, a) -> (p.getAge() > Integer.valueOf(a)), "25");
        
    }
    
    public static void printConditionally(List<Person> people, Condition condition, String startChar) {
        for (Person person : people) {
            if (condition.test(person, startChar)) {
                System.out.println(person);
            }
        }
    }
}

interface Condition {
    public boolean test(Person p, String condition);
}
