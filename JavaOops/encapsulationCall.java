package JavaOops;

public class encapsulationCall {
    public static void main(String[] args){
        encapsulation First = new encapsulation(1, "Bhushan", 22, 5, 1);
        System.out.println(First.id);
        System.out.println(First.name);

        System.out.println(First.getAge());      // - This is access only by method call not directly due to private variable 
        System.out.println(First.getnoSub());    // - This is access only by method call not directly due to private variable
        System.out.println("Old No Of GF.."+First.getNoGF());
        First.setNoGF(3);
        System.out.println("New No Of GF.. "+First.getNoGF());

        First.Study();
        First.Eat();
        // First.Sleep();   // - This is not access due to private method or function.
    }
}
