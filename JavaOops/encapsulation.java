package JavaOops;

public class encapsulation {
    public int id;
    public String name;
    private int age;
    private int noSub;
    private int noGF;

    public int getAge() {
        return this.age;
    }

    public int getnoSub() {
        return this.noSub;
    }

    public int getNoGF() {
        return this.noGF;
    }

    public void setNoGF(int noOfGF) {
        this.noGF = noOfGF;
    }

    public encapsulation(int id, String name, int age, int noSub, int noGF) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.noSub = noSub;
        this.noGF = noGF;
    }

    void Study() {
        System.out.println("I am Studying..");
    }

    void Eat() {
        System.out.println("I am Eating..");
    }

    private void Sleep() {
        System.out.println("I am Sleeping..");
    }
}
