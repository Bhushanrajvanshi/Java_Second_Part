import java.util.Scanner;

public class primeNum {
    static boolean isPrime(int num){
        if( num==1 ) return false;
        // for(int i=2; i<=num-1; i++){
        //     if(num%i==0){
        //         return false;
        //     } 
        // }


        // Little bit optimizing
        for(int i=2; i*i<=num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println(isPrime(num));
    }
}