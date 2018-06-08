package reflection;

public class Car {
    private String brand;
    private String color;
    private int maxSpeed;

    //默认构造方法
    public Car() {};

    //
    public Car(String brand, String color, int maxSpeed) {
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void introduce() {
        System.out.println("brand" + brand + "color" + color + "maxSpeed" + maxSpeed);
    }



}
