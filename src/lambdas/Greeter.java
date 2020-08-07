package lambdas;

public class Greeter {
    public void greet(Greeting greeting) {
        greeting.perform();
    }
    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello World from inner class");
            }
        };
        Greeting lambdaGreeting = ()-> System.out.println("Hello World!!");

        greeter.greet(lambdaGreeting);
        greeter.greet(()->System.out.println("Hello Worlddddd"));
        greeter.greet(innerClassGreeting);

    }
}
