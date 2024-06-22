import java.util.Scanner;
public class Fabonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int result = 1; 
        int previous = 0;
        for(int i = 1; i < num; i++) {
            if( num <= 1){
                result = num;
            } 
            int temp = result;
            result = result + previous;
            previous = temp;
        }
        System.out.println("The fabonacci of the number is: " + result);
    }
}