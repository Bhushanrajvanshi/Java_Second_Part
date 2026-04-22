package JavaOops;

public class constructorCall {
    public static void main(String[] args) {
        // default constructor call
        new constructor();

        // parameterize constructor call
        constructor First = new constructor("Bhushan", 23, 5);
            System.out.println(First.name);
            System.out.println(First.age);
            System.out.println(First.noSub);

            First.Sleep();

        // copy constructor call  
        constructor Second = new constructor(First);
            System.out.println(Second.name);
            System.out.println(Second.age);
            System.out.println(Second.noSub);

            Second.Study();
            Second.Eat();
            Second.Sleep();
    }
}
