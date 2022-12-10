package def2;

public interface MyInterface {
    default void method1(){

    }; // 구현이 X : 추상 메소드

    default void method2(){

    }; // 정의하기 싫은 method
}

