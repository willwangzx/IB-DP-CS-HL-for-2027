public class carclass {
    private static int carCount = 0;

    private final String serialNumber;
    private String brand;
    private String color;
    private final double maxSpeed;
    private double speed;
    private double fuel;

    public carclass(String serialNumber, String brand, String color, double maxSpeed) {
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.fuel = 0;
        carCount++;
    }

    // 加油，最大油量按 60L 处理。
    public void addFuel(double amount) {
        if (amount > 0) {
            fuel = Math.min(60, fuel + amount);
        }
    }

    // 加速，速度不超过最大值。
    public void accelerate(double delta) {
        if (delta > 0) {
            speed = Math.min(maxSpeed, speed + delta);
        }
    }

    // 减速，速度不低于 0。
    public void brake(double delta) {
        if (delta > 0) {
            speed = Math.max(0, speed - delta);
        }
    }

    public boolean isDriving() {
        return speed > 0;
    }

    public static int getCarCount() {
        return carCount;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSpeed() {
        return speed;
    }

    public double getFuel() {
        return fuel;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}
