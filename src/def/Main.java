package def;

interface MyInterface {
    void method1(); // 구현이 X : 추상 메소드

    default void sayHello() { // 구현이 ㅇ
        System.out.println("자바 8부터 interface에 default 사용시 구현 가능하다.");
    }
}

public class Main implements MyInterface{
    public static void main(String[] args) {
        Main main = new Main();
        main.method1();
        main.sayHello();
    }
    @Override
    public void method1() {
        return;
    }
}
