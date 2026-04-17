import java.util.Scanner;

public class getLCM {
    static int getGreatestCD(int a, int b){
        while( b!=0 ){
            int oldValue = b;
            b = a % b;
            a = oldValue;
        }
        return a;
    }

    static int getLeastCM(int a, int b){
        int GCD = getGreatestCD(a, b);
        int product = a * b;
        int LCM = product / GCD;
        return LCM;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("Least Common Multiple is : "+ getLeastCM(a, b));
    }
}