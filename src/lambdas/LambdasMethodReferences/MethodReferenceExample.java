package lambdas.LambdasMethodReferences;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Thread t = new Thread(MethodReferenceExample::printMethod);
        t.start();
    }

    public static void printMethod() {
        System.out.println("Hello World");
    }
}
