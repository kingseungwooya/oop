package generics.generic;

@FunctionalInterface
public interface MyMapper<IN, OUT> {
    OUT map(IN s);
}
