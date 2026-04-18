import java.util.Scanner;

public class countEvenNum {
    static int countEven(int num){
        int count = 0;
        while( num!=0 ){
            int remainder = num % 10;
            if( remainder%2==0 ){
                count++;
            }
            num = num / 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a number: ");
        int num = sc.nextInt();
        System.out.println("Total Even number is: "+ countEven(num));
    }
}
