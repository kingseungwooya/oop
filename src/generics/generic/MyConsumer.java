package generics.generic;

@FunctionalInterface
public interface MyConsumer<T> {
    void consume(T t);
}
