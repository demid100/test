package test02;


import java.util.function.Consumer;

public class TestLambda {
   private String firstName;
    private String secondName;

    public TestLambda(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public static void main(String[] args) {
        TestFactory<TestLambda> createTL = TestLambda::new;
        TestLambda test  = createTL.create("Alla", "Dydy");
        System.out.println(test);

        int count = execute(() -> System.out.println("Hello"));

        Convert<String, String> convert = System.out::println;
        convert.convert("Ayyyyyyyyyyyyyyyy");

        Consumer<TestLambda> consumer = (tl) -> System.out.println("Hello " + tl.firstName+
                                                                    " " + tl.secondName);
        consumer.accept(createTL.create("Dada", "Manada"));

    }

    public static int  execute(Runnable runnable){
        System.out.println("start");
        runnable.run();
        System.out.println("end");
        return 5;
    }

    @Override
    public String toString() {
        return "TestLambda{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
