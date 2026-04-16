public class countDigits {
    static int reverseNum(int num){
        int rev = 0;
        while( num>0 ){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev;
    }
    public static void main(String[] args){
        int num = 12345;
        int revNum = reverseNum(num);
        System.out.print("reverse numbers is: "+ revNum);
    }
}