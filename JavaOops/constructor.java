package JavaOops;

public class constructor {
    String name;
    int age;
    int noSub;


    // default Constructor
    public constructor() {
        System.out.println("I am a default constructor");
    };

    // Parameterize Constructor
    public constructor(String name, int age, int noSub){
        this.name = name;
        this.age = age;
        this.noSub = noSub;
    };
    

    // copy Constructor
    public constructor(constructor copy){
        this.name = copy.name;
        this.age = copy.age;
        this.noSub = copy.noSub;
    }

    // this is methods or function
    void Study() {
        System.out.println("I am Studying..");
    };

    void Eat() {
        System.out.println("I am Eating..");
    };
    void Sleep() {
        System.out.println("I am Sleeping..");
    };
}
