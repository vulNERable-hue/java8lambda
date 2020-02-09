public class Person {
    private String name;
    private int age;
    
    Person(String n, int a) {
        this.name = n;
        this.age = a;
    }
    
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    
    public String toString() {
        return "Person [name: " + this.name + ", age: " + this.age + "]";
    }
}
