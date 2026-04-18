import java.util.Scanner;

public class perfectNum {
    static boolean perfectNumber(int num){
        int sum = 0;
        int oldNum = num;
        for(int i=1; i<=num/2; i++){
            if( num%i==0 ){
                sum = sum + i;
            }
        }

        if(sum==oldNum){
            System.out.print("This is a perfect Number: ");
            return true;
        }
        System.out.print("This is Not a perfect Number: ");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a number: ");
        int num = sc.nextInt();

        System.out.println(perfectNumber(num));
    }
}
