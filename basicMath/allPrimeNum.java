import java.util.Scanner;

public class allPrimeNum {
    static boolean isPrimeOrNot(int num){
        for(int i=2; i<=num/2; i++){
            if( num%i==0 ){
                return false;
            }
        }
        return true;
    }

    static void printAllPrimeNum(int num){
        for(int i=2; i<=num; i++){
            boolean isPrime = isPrimeOrNot(i);
            if( isPrime==true ){
                System.out.print(" "+i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a number: ");
        int num = sc.nextInt();
        printAllPrimeNum(num);
    }
}
