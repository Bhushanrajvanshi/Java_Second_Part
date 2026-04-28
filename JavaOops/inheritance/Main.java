package JavaOops.inheritance;

public class Main {
    public static void main(String[] args) {
        Car c = new Car("maruti", "808XUV", 4, 5, "auto");
        c.startEngine();
        c.startAC();
        c.stopEngine();

        System.out.println();

        MotorCycle motor = new MotorCycle("Hero", "splender+", 2, "U-shape", "SoftWay");
        motor.startEngine();
        motor.wheelie();
        motor.stopEngine();
    } 
}
