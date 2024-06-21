import java.util.Scanner;
public class Recursive {
    public static void main(String[] args) {
        //factorial of n
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //if num = 5
        int result = factorial(num); // for first call --> (on stack memory) result = 5 * factorial(4) / second call --> result = 5 * 4 * factorial(3)
        System.out.println("The factorial: "+ result);
    }
    public static int factorial(int num) {
        if( num <= 1){
            return 1;
        }
        return num * factorial(num-1);
    }
}
