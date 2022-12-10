package lambda;

import func.MySupply;

public class Main {
    public static void main(String[] args) {
        // Before Lambda
        MySupplier mySupplier = new MySupplier() {
            @Override
            public String supply() {
                return "HelloWorld";
            }
        };

        // After Lambda
        MySupplier mySupplier1 = () -> "HelloWorld";

        // Better
        MySupplier mySupplier2 = Main::supply;


        // Before
        MyMapper m = new MyMapper() {
            @Override
            public int map(String s) {
                return s.length();
            }
        };

        // After
        MyMapper myMapper = (s) -> s.length();

        // Better
        MyMapper myMapper1 = String::length;


        // Before
        MyConsumer myConsumer = new MyConsumer() {
            @Override
            public void consume(int i) {
                System.out.println(i);
            }
        };

        // After
        MyConsumer myConsumer1 = (s) -> System.out.println(s);

        // 매우 간단히 3줄로 표현 가능
        MyRunnable myRunnable = () -> {
            myConsumer.consume(m.map(mySupplier.supply()));
        };
    }

    private static String supply() {
        return "HelloWorld";
    }
}
