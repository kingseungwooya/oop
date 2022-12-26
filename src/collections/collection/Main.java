package collections.collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        MyCollection<String> c1 = new MyCollection<>(Arrays.asList("12", "123", "1234", "12345", "123456"));
        c1.foreach(System.out::println);

        MyCollection<Integer> c2 = c1.map(String::length); // mapper역할
        c2.foreach(System.out::println);

        // 중간 변수로 가지 않고 바로 하는 방법?
        new MyCollection<>(Arrays.asList("12", "123", "1234", "12345", "123456"))
                .map(String::length)
                .foreach(System.out::println);

        // filter 사용해보기
        new MyCollection<>(Arrays.asList("12", "123", "1234", "12345", "123456"))
                .map(String::length)
                .filter(i -> i % 2 == 0)
                .foreach(System.out::println);

        int size = new MyCollection<>(Arrays.asList("12", "123", "1234", "12345", "123456"))
                .map(String::length)
                .filter(i -> i % 2 == 0)
                .size();
        System.out.println(size);
    }
}
