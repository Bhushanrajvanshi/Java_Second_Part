public class countDigits {
    static int countNum(int num){
        int count = 0;
        while( num!=0 ){
            num = num / 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        int num = 12346;
        int count = countNum(num);
        System.out.println("The number of digits in "+num+" is: "+count);
    }
}