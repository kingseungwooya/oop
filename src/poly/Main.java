package poly;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService(new KaKaoLogin());
        userService.login();
    }

}
