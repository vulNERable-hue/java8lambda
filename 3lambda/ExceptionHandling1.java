import java.util.*;
import java.util.function.*;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int key = 1;
        
        process(nums, key, (e, k) -> {
            try {
                System.out.println(e/k);
            } catch (ArithmeticException ex) {
                System.out.println(ex.getMessage());
            }
        });
    }
    
    public static void process(int[] nums, int key, BiConsumer<Integer, Integer> consumer) {
        for (int e : nums) {
            consumer.accept(e, key);
        }
    }
}
