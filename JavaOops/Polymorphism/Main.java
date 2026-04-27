package JavaOops.Polymorphism;

public class Main {
    public static void main(String[] args) {

        //!  -> The first is Compile-time Polymorphism, also called Static Polymorphism.
        // Calculater cal = new Calculater();
        // System.out.println(cal.add(3, 5));
        // System.out.println(cal.add(3, 5, 7));
        // System.out.println(cal.add(3, 5, 3.5));


        //!  -> The second is Run-time Polymorphism, also called Dynamic Polymorphism.
        Circle c = new Circle();
        doDrawingStuff(c);

        Rect r = new Rect();
        doDrawingStuff(r);

        Shape s = new Shape();
        doDrawingStuff(s);

    }

    public static void doDrawingStuff(Shape a) {
        a.draw();   //polymorphism
    }
}
