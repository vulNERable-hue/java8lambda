import java.util.*;
import java.util.function.*;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int key = 0;
        
        process(nums, key, wrapperLambda((e, k) -> System.out.println(e/k)));
    }
    
    public static void process(int[] nums, int key, BiConsumer<Integer, Integer> consumer) {
        for (int e : nums) {
            consumer.accept(e, key);
        }
    }
    
    public static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
        return (e, k) -> {
            try {
                consumer.accept(e,k);
            } catch (ArithmeticException ex) {
                System.out.println(ex.getMessage());
            }
        };
    }
}
