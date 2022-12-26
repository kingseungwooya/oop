package collections.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyCollection<T> {
    private List<T> list;

    public MyCollection(List<T> list) {
        this.list = list;
    }

    // 이 메서드에서만 U타입으로 반환 받아라
    public <U> MyCollection<U> map(Function<T, U> function) { // T에서 U타입으로 바꿔주는 Mapping해주는
        List<U> newList = new ArrayList<>();
        foreach(d -> newList.add(function.apply(d)));
        return new MyCollection<>(newList);
    }

    public int size() {
        return list.size();
    }

    public MyCollection<T> filter(Predicate<T> predicate) { // T에서 U타입으로 바꿔주는 Mapping해주는
        List<T> newList = new ArrayList<>();
        foreach(d -> {
            if (predicate.test(d)) newList.add(d);
        });
        return new MyCollection<>(newList);
    }

    public void foreach(Consumer<T> consumer) {
        for (int i = 0; i < list.size(); i++) {
            T data = list.get(i);
            consumer.accept(data);
        }
    }
}
