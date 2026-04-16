import java.util.Scanner;


public class palindromeNum {
    static int reverseNumber(int num){
      int revNum = 0;
      while( num!=0 ){
        int rem = num % 10;
        revNum = revNum * 10 + rem;
        num = num / 10;
      }  
      return revNum;
    }

    static boolean isPalindrome(int num){
        int revNum = reverseNumber(num);

        if( revNum==num ){
            System.out.print("It is a Palindrome Number : ");
            return true;
        } else {
            System.out.print("It is Not a Palindrome Number : ");
            return false;
        }
    }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);   
      System.out.print("Enter a number: ");
      int num = sc.nextInt();
      System.out.print(isPalindrome(num));
    }
}