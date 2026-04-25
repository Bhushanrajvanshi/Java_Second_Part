package JavaOops.inheritance;

public class Vehicle {
    public String name;
    public String model;
    public int noTyres;


    Vehicle(){
        this.name = "";
        this.model = "";
        this.noTyres = -1;
    }

    Vehicle(String name, String model, int noTyres) {
        this.name = name;
        this.model = model;
        this.noTyres = noTyres;
    }

    void startEngine() {
        System.out.printf("engine is Starting of %s : %s\n", name, model);
    }

    void stopEngine() {
        System.out.printf("engine is Stopping of %s : %s\n", name, model);
    }
}
