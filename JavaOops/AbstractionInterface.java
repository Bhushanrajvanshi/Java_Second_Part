package JavaOops;


//! ->  Abstraction
// abstract class Bird {
//     abstract void fly();
//     abstract void eat();
// }

// class Sparrow extends Bird {
//     void fly() {
//         System.out.println("Sparrow can fly");
//     }

//     void eat() {
//         System.out.println("Sparrow eats seeds");
//     }
// }

// class Crow extends Bird {
//     void fly() {
//         System.out.println("Crow can fly");
//     }

//     void eat() {
//         System.out.println("Crow eats seeds");
//     }
// }



//! ->  Interface  implementation 
interface Bird{
    void eat();
    void fly();
}

class Sparrow implements Bird{
   public void fly() {
        System.out.println("Sparrow can fly");
    }

    public void eat() {
        System.out.println("Sparrow eats seeds");
    }
}

class Crow implements Bird {
    public void fly() {
        System.out.println("Crow can fly");
    }

    public void eat() {
        System.out.println("Crow eats seeds");
    }
}

public class AbstractionInterface {

    public static void doBirdStuff(Bird b) {
        b.eat();
        b.fly();
        b.eat();
        b.fly();
    }
    public static void main(String[] args) {
        // Bird b = new Sparrow();   // you can not create object of bird due to Abstract class
        // b.eat();
        // b.fly();

        // b = new Crow();
        // b.fly();
        // b.eat();

        doBirdStuff(new Sparrow());
        doBirdStuff(new Crow());
    }
}
