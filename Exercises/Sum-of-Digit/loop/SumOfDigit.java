import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int digitLengthOfNum = String.valueOf(Math.abs(num)).length();
        int result = 0;
        for(int i = 0; i < digitLengthOfNum; i++) {
            int lastDigit = num  % 10; 
            num = num / 10;
            result = result + lastDigit;
        }
        System.out.println("The sum of digit is: " + result);
    }
}
