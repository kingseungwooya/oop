package def3;

interface Swimmable {
    default void swim(){
        System.out.println("어짜피 날다라는 것은 모든 클래스에서 공통적이니 default로해서"
                + "각 클래스마다의 재구현 필요성을 줄인다.");
    };
}
interface Walkable {
    default void walk(){
        System.out.println("걷다도 마찬가지");
    };
}
interface Flyable {
       default void fly() {
           System.out.println("날다도 마찬가지");
       };
}
interface Util {
    static void print(String message) {
        System.out.println(message);
    }
    static void input() {
        System.out.println("값을 입력해주세요");
    }
}
