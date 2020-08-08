package lambdas;

import java.util.function.Consumer;

public class ClosuresExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        doProcess(a, k->System.out.println(k+b)); //considers the b and expects it to be finalr
    }

    public static void doProcess(int i, Consumer<Integer> consumer) {
        consumer.accept(i);
    }
}

