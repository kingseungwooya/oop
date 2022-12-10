package func;

public class Main2 {
    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable() {
            @Override
            public void run() {
                System.out.println("hi");
            }
        };
        r1.run();

        // 위에 방식은 뻔한 부분이 많다. 다 양식이 있는건데 굳이 다시 쓸 이유가 있나?

        MyRunnable r2 = () -> System.out.println("hi");

        // 람다식으로 표현 근데 이건 run함수 표시도 없고 그러면 함수형 인터페이스에서만
        // 가능하곘지.

        r2.run();

        MySupply s1 = () -> "Hello World";

        MyRunnable r3 = () -> {
            MySupply s2 = () -> "Hello Hello World";
            System.out.println(s2.supply());
        };
        r3.run();
        // 지금 r1과 r2는 똑같은 기능을 한다.

    }

}
