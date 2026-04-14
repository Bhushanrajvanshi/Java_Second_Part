public class printDigits {
    static void printNum(int num){
        while(num > 0){
            int digit = num % 10;
            System.out.print(digit+" ");
            num /= 10;
        }
    }
    public static void main(String[] args){
        int num = 12345;
        printNum(num);
    }
}