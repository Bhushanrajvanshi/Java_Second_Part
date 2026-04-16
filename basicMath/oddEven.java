import java.util.Scanner;

public class oddEven {
    static boolean isOdd(int num) {
        int remainder = num % 2;
        if(remainder==0){
            System.out.print("It is a Even number: ");
            return true;
        } else {
            System.out.print("It is a Odd number: ");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(isOdd(num));
    } 
}