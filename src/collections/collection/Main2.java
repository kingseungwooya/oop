package collections.collection;


import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        new MyCollection<User>(
                Arrays.asList(
                        new User(15, "AAA"),
                        new User(16, "BBB"),
                        new User(17, "CCC"),
                        new User(18, "DDD"),
                        new User(19, "FFF"),
                        new User(20, "GGG")
                )
        )
                //.filter(u -> u.getAge() >= 18) 이 방법은 가독성면에서 떨어진다.
                // 객체지향적으로 객체에게 일을 시키자
                .filter(User::isOver18)
                //.map(User::getName)
                //.foreach(System.out::println); 출력도 객체에게 일을 맡긴다.
                .foreach(System.out::println);
                // toString을 통해 출력 형태를 바꿔준다. toString이 없을 시 값의 주소가 출력된다.  
    }

}
