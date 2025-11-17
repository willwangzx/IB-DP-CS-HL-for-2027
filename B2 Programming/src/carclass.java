public class carclass {
    static String brand;
    static int number=0;
    private String serial_number,model,engine,color;
    private double fuel_amount,max_speed,speed,turn_angle;
    public carclass(String serial_number,String color,double max_speed){
        this.serial_number=serial_number;
        this.color=color;
        this.max_speed=max_speed;
        number++;
    }
    public void setBrand(String b){
        brand=b;
    }
    public Boolean drive(){
        return speed!=0;
    }
    public double turn(double turn_angle){
        this.turn_angle+=turn_angle;
        return this.turn_angle;
    }
    public double addfuel(double amount){
        if(amount+this.fuel_amount>=60)this.fuel_amount=60;
        else this.fuel_amount+=amount;
        return fuel_amount;
    }
    public double remaining_fuel(){
        return fuel_amount;
    }
    public double current_speed(){
        return speed;
    }
    public void accelerate(double dv){
        speed+=dv;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
}
