import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int result = sumOfDigits(num);
        System.out.println("Sum of digit is: " + result);
    }
    public static int sumOfDigits(int num){
        if(num < 10){
            return num;
        }
        int lastDigit = num % 10;
        int remainingNumber = num / 10;
        return lastDigit + sumOfDigits(remainingNumber);
    }
}
