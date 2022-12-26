package collections.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        Arrays.asList(1, 2, 3)
                .stream();

        // primitive타입들은 객체가 아니기에 IntStream등의 stream으로 변환된다.
        IntStream intStream = Arrays.stream(new int[]{1, 2, 3}); // primitive를 변환 가능하다.

        // int를 Integer로 변환하는 방법
        List<Integer> list = Arrays.stream(new int[]{1, 2, 3})
                .boxed()
                .collect(Collectors.toList()); // boxing한다.

        Integer[] array = Arrays.stream(new int[]{1, 2, 3})
                .boxed()
                .toArray(Integer[]::new); // Array타입으로 변환하기 위해선 타입을 정해줘야한다. default는 Object이다.

    }
}
