package lambdas;

import java.util.function.BiConsumer;

public class ExceptionHandling {
    public static void main(String[] args) {
        int [] someNumbers = {1,2,3,4,5};
        int key = 0;
        process(someNumbers, key, (p,k)-> {
            try {
                System.out.println(p / k);
            }
            catch (ArithmeticException e) {
                System.out.println("ArithmeticException occured");
            }
        });
    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> biConsumer) {
        for(int i: someNumbers) {
            biConsumer.accept(i, key);
        }
    }
}
