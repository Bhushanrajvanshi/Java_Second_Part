import java.util.Scanner;

public class armstrongNum {
    static int totalDigits(int num){
        int count = 0;
        while( num!=0 ){
            int remain = num % 10;
            count++;
            num = num / 10;
        }
        return count;
    }

    static int totalSum(int num){
        int sum = 0;
        int numOfDigits = totalDigits(num);
        while( num!=0 ){
            int product = 1;
            int lastDigit = num % 10;
            for(int i=1; i<=numOfDigits; i++){
                product = product * lastDigit;
            }
            sum = sum + product;
            num = num / 10;
        }
        return sum;
    }

    static boolean isArmstrongNum(int num){
        int totalSumOfDigits = totalSum(num);
        if( num==totalSumOfDigits ) {
            System.out.print("It is a Armstrong Number: ");
            return true;
        } else {
            System.out.print("It is Not a Armstrong Number: ");
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.print(isArmstrongNum(num));
    }
}