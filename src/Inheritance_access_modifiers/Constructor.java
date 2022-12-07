package Inheritance_access_modifiers;

class Car {
    String manufacturer;
    String model;
    String color;
    String year;
    int carSpeed;

    Car(String w, String x) {
        manufacturer = w; // this.manu…
        model = x; // this.model
        color = "black"; // this.color
        year = "2022"; // this.year
        carSpeed = 0; // this.curSpeed
    }

    // 생성자를 하나 더 만듬
    Car(String x) {
        this(x, "Unknown");
    }

    void pushBreak() {
        this.carSpeed--;
    }

    void pushAccel() {
        this.carSpeed++;
    }

}

public class Constructor {
    public static void main(String[] args) {
        Car myCar = new Car("Renault", "XM3");
        Car yourCar = new Car("Hyundai");
        System.out.println(myCar.manufacturer);
        System.out.println(myCar.model);
        System.out.println(myCar.color);
        System.out.println(myCar.year);
        System.out.println(myCar.carSpeed);

        System.out.println(yourCar.manufacturer);
        System.out.println(yourCar.model);
        System.out.println(yourCar.color);
        System.out.println(yourCar.year);
        System.out.println(yourCar.carSpeed);
    }
}
