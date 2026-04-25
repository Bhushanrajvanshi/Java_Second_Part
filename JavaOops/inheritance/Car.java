package JavaOops.inheritance;

public class Car extends Vehicle {
    public int noDoors;
    public String transmissionType;

    Car(String name, String model, int noTyres, int noDoors, String transmissionType ){
        // super();     // here default constructor call.
        super(name, model, noTyres);        // here parameterized constructor call

        this.noDoors = noDoors;
        this.transmissionType = transmissionType;
    }

    public void startAC() {
        System.out.println("AC Startted of "+ name);
    }
}
