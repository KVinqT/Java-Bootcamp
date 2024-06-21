import java.util.Scanner;
public class SumOfNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number: ");
        int num = sc.nextInt();
        int result = 0;
        for(int i = num; i >= 1; i--) {
            result+= i;
        }
        System.out.println("The sum of the natural number is: " + result);
    }
}
