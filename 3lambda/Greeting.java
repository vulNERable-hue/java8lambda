
@FunctionalInterface //indicates that this interface cannot have more than 1abstract method
public interface Greeting {
    //Greeting is functional interface
    //functional interface is an interface with only 1 abstract(unimplemented) method
    //other methods can have default implementations(allowed in java8)
    public void perform();
    
    //public void another();
    //other developers cannot add another() abstract method, the @FunctionalInterface prevents it!
}
