package collections.iterator;

import collections.collection.MyCollection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("12", "123", "1234", "12345", "123456");
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 객체에 Iterator를 만들어 객체에게 또다시 순회하게 시켜보자
        MyIterator<String> myIterator = new MyCollection<String>(Arrays.asList("12", "123", "1234", "12345", "123456"))
                .iterator();

        while (myIterator.hasNext()) {
            String s = myIterator.next();
            int len = s.length();
            if (len % 2 == 0) continue;
            System.out.println(s);
        }

    }
}
