package poly;

// Login할 수 있는 기능
public class UserService implements Login{

    // Login에 의존한다.
    // Service내에서 Login에 인스턴스를 생성한다면 UserService는 카카오나 네이버 둘 중 하나에만
    // 로그인 할 수 있다.
    // 그것을 결정하는 것을 외부에게 맡긴다면 즉 의존성을 낮춘다면 여러 타입이 들어와도 기능적으로 문제가 없다.

    // private KaKaoLogin kaKaoLogin;
    // private NaverLogin naverLogin;
    // 위는 강한결합 구사체와 결합

    private Login login;
    // 추상체와 결합 --> 결합도가 낮아짐
    // 의존성을 주입 받았다. DI
    // 원래는 service가 naver와 kakao에 의존하고 있었다면,
    // 추상체와 결합함으로 Login이라는 추상체에 인터페이스에 의존하게 되고
    // 구상체들은 추상체에 의존하게 된다.
    // 의존성 역전이 일어난다. ! Dependency Inversion  -> DIP SOLID 5번쨰 원칙
    // 구상체를 의존하지말고 추상체를 통해서 의존해라 ..

    public UserService(Login login) {
        this.login = login;
    }

    @Override
    public void login() {
        login.login();
    }
}
