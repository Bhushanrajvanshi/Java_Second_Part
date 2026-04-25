package JavaOops.inheritance;

public class MotorCycle extends Vehicle {
    public String handleBarStyle;
    public String suspensionType;

    MotorCycle( String name, String model, int noTyres, String handleBarStyle, String suspensionType ){
        super(name, model, noTyres);

        this.handleBarStyle = handleBarStyle;
        this.suspensionType = suspensionType;
    }

    public void wheelie(){
        System.out.println("MotoeCycle is doing wheelieee. "+ name);
    }
}
