package lambdas;

public class ThisReferenceExample {
    public void doProcess (int i, Process p) {
        p.process(i);
    }

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
        thisReferenceExample.doProcess(10, (k)-> {
            System.out.println(k);
            //System.out.println(this); Lambdas are considered as within the scope of it's function calling it. Here main is static. So, this doesn't work.
        });

        thisReferenceExample.execute();
    }

    private void execute() {
        doProcess(10, (k)-> {
            System.out.println(k);
            System.out.println(this); //This points to the instance of thisReferenceExample on which this is called or outside of the lambda
        });
    }

    @Override
    public String toString() {
        return "ThisReferenceExample{}";
    }
}

interface Process {
    void process (int i);
}
