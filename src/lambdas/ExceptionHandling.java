package lambdas;

import java.util.function.BiConsumer;

public class ExceptionHandling {
    public static void main(String[] args) {
        int [] someNumbers = {1,2,3,4,5};
        int key = 0;
        process(someNumbers, key, wrapperLambda((p,k)->System.out.println(p / k)));
    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> biConsumer) {
        for(int i: someNumbers) {
            biConsumer.accept(i, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer) {
        return (p,k) -> {
//            System.out.println("Executing from wrapper");
            try {
                biConsumer.accept(p, k);
            }
            catch (ArithmeticException e) {
                System.out.println("Exception occured");
            }
        };
    }
}
