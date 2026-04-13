public class carclass {
    // 类属性：所有汽车共享。
    private static String brand;
    private static int number = 0;

    // 实例属性：每辆车独有。
    private final String serialNumber;
    private String model;
    private String engine;
    private String color;
    private double fuelAmount;
    private final double maxSpeed;
    private double speed;
    private double turnAngle;

    public carclass(String serialNumber, String color, double maxSpeed) {
        this.serialNumber = serialNumber;
        this.color = color;
        this.maxSpeed = maxSpeed;
        number++;
    }

    public static void setBrand(String b) {
        brand = b;
    }

    public static String getBrand() {
        return brand;
    }

    public static int getNumber() {
        return number;
    }

    /**
     * 是否处于行驶状态。
     */
    public boolean drive() {
        return speed != 0;
    }

    /**
     * 转向：累计方向盘角度。
     */
    public double turn(double deltaAngle) {
        this.turnAngle += deltaAngle;
        return this.turnAngle;
    }

    /**
     * 加油：油量上限 60。
     */
    public double addFuel(double amount) {
        fuelAmount = Math.min(60, fuelAmount + amount);
        return fuelAmount;
    }

    public double getRemainingFuel() {
        return fuelAmount;
    }

    public double getCurrentSpeed() {
        return speed;
    }

    /**
     * 加速，同时限制最大车速。
     */
    public void accelerate(double deltaSpeed) {
        speed = Math.min(maxSpeed, speed + deltaSpeed);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}
