public class countDigits {
    static int sumNum(int num){
        int sum = 0;
        while(num > 0 ){
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int num = 123456;
        int sum = sumNum(num);
        System.out.println("The sum of the digits is: " + sum);
    }
}