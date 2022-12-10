package generics.generic;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main2 {
    public static void main(String[] args) {
        //new Main2().loop(10, System.out::println);

        // 호출하는 쪽에서 바꾼다. 구현쪽은 건들지 않는다

        new Main2().filteredNumber(30, i -> i % 2 == 0, System.out::println);
    }

    // 그냥 반복문이 아니라 반복문 중 해야할 일을 inject 받는다면?

    //  이 기능은 바꾸지 아니하고 호출쪽에서 값을 정한다.
    void filteredNumber(int max, Predicate<Integer> p, Consumer<Integer> c) {
        for (int i = 0; i < max; i++) {
            if (p.test(i)) {
                c.accept(i);
            }
        }
    }

    void loop(int n, MyConsumer<Integer> consumer) {
        for (int i = 0; i < n; i++) {
            // == 입력은 있고, 출력은 따로 없어도 된다.
            consumer.consume(i); // Consumer에게 일을 시킨다.,
        }
    }
}
