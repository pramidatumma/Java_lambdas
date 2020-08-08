package lambdas;

public class ThisReferenceExample {
    public void doProcess (int i, Process p) {
        p.process(i);
    }

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
        thisReferenceExample.doProcess(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println(i);
                System.out.println(this); // This is referring to the anonymous inner class new Process
            }

            @Override
            public String toString() {
                return "This is anonymous innerclass";
            }
        });


    }
}

interface Process {
    void process (int i);
}
