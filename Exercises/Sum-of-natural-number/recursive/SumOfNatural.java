import java.util.Scanner;
public class SumOfNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number: ");
        int num = sc.nextInt(); //is input is 5
        int result = sumOfNaturalNumbers(num); // 5 + 4 + 3+ 2 + 1
        System.out.println("The sum of natural number is: " + result);
    }
    public static int sumOfNaturalNumbers(int num){
        if(num == 1){
            return 1;
        }
        return num + sumOfNaturalNumbers(num-1);
    }
}
