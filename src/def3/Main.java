package def3;

class Duck implements Swimmable, Walkable {

}
class Swan implements Flyable, Walkable {

}
// 어짜피 기능적으로 모두 같은역할을 함 재 구현하는 낭비를 하지 않아도 된다.
public class Main {
    public static void main(String[] args) {
        new Duck().swim();
        new Duck().walk();
        new Swan().fly();
        new Swan().walk();
    }
}
