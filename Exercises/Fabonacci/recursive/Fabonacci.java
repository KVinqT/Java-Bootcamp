import java.util.Scanner;

public class Fabonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt(); // num = 3
        int result = fibonacci(num);  // result = fibonacci(2) + fabonacci(1) // result = 1 + 1 = 2
        System.out.println("The fabonacci is: " + result);
        sc.close();
    }

    public static int fibonacci(int num){
        if(num <= 2){
            int result = switch(num){
                case 0 -> 0;
                case 1 -> 1;
                case 2 -> 1;
                default -> 0;
            };
            return result;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
}
