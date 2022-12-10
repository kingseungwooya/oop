package generics.generic;


public class Main {
    public static void main(String[] args) {
        // Generics를 사용해 다향성을
        MySupplier<String> s = () -> "Hello";
        MyMapper<String, Integer> m = String::length;
        MyConsumer<String> c = System.out::println;

        MyMapper<Integer, Integer> m2 = i -> i * i;

        MyMapper<Integer, String> m3 = Integer::toHexString;

        MyRunnable r = () ->
                m3.map( // Integer
                        m2.map( // String
                                m.map( // Integer
                                        s.supply() // String
                                )
                        )
                );

        r.run();
    }
}
