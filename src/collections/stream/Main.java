package collections.stream;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Arrays.asList("A", "AB", "ABC", "ASD", "GDAADF", "ASGFD")
                .stream()
                .map(String::length)
                .filter(i -> i % 2 == 1)
                .forEach(System.out::println);

    }
}
