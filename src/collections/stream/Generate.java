package collections.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Stream;

public class Generate {
    public static void main(String[] args) {

        // stream은 데이터의 흐름이다.
        Random r = new Random();
        Stream.generate(r::nextInt)
                .forEach(System.out::println); // 무한으로 랜덤값을 생성한다.

        Stream.generate(r::nextInt)
                .limit(10)
                .forEach(System.out::println); // 무한으로 랜덤값을 생성한다.
        // limit을 이용해 제한을 둘 수 있다.

        // iterator를 이용해 데이터 만들기
        // 0부터 시작해서 다음 함수와 같이 생성해라
        Stream.iterate(0, (i) -> i + 1)
                .limit(10)
                .forEach(System.out::println);

        // 주사위를 던져 6이 나올 확률 구하기
        long count = Stream.generate( () -> r.nextInt(6) + 1)
                .limit(100)
                .filter(n -> n == 6)
                .count();

        // 중복 제거해 출력해보기
        int[] arr = Stream.generate(() -> r.nextInt(10) + 1)
                .distinct()
                .limit(3)
                .mapToInt(i -> i)
                .toArray();
        System.out.println(Arrays.toString(arr));

        // sort 써보기
        // 중복 제거해 출력해보기
        int[] arr2 = Stream.generate(() -> r.nextInt(10) + 1)
                .limit(3)
                .sorted(Comparator.reverseOrder())
                .mapToInt(i -> i)
                .toArray();
        System.out.println(Arrays.toString(arr));



    }
}
