import java.util.Scanner;
public class Factorial {
    public static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            System.out.println("Enter a number : ");
            int num = sc.nextInt();
            int result = 1;
            for(int i = num; i >= 1; i--) {
                result*= i; 
            }
            System.out.println(result);
        }
}