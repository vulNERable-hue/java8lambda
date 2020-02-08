import java.util.*;

public class Exercise1 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Bob", 32),
            new Person("Alex", 21),
            new Person("Jason", 28),
            new Person("Carl", 35),
            new Person("Arin", 25)
        );
        
        //1. sort people by name
        Collections.sort(people, new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        
        //2. method to print people
        System.out.println("Print all persons");
        printPeople(people);
        
        //3. method to print people whose name start with C
        System.out.println("Print people whose name starts with C");
        printPeopleWhoseNameStartWithC(people);
        
        System.out.println("Print conditionally");
        printConditionally(people, new Condition() {
            public boolean test(Person p, String startChar) {
                return p.getName().startsWith(startChar);
            }    
        }, "A");
    }
    
    public static void printPeople(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
    
    public static void printPeopleWhoseNameStartWithC(List<Person> people) {
        for (Person person : people) {
            if (person.getName().startsWith("C")) {
                System.out.println(person);
            }
        }
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
    public boolean test(Person p, String startChar);
}
