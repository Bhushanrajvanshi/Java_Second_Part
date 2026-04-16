import java.util.Scanner;

public class getGCD {
    static int GreatestCommonDivision(int a, int b){
        while( b!=0 ){
            int oldValueOfB = b;
            b = a % b;
            a = oldValueOfB;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first numbers: ");
        int a = sc.nextInt();
        System.out.println("Enter the second numbers: ");
        int b = sc.nextInt();
        System.out.println("Greatest Number of Division is :"+GreatestCommonDivision(a, b));
    }
}