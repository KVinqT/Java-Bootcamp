import java.util.Scanner;
public class ReverseString {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str= sc.nextLine();
        System.out.println("Reverse string is "+ reverseString(str));
    }
    public static String reverseString(String str){
        if(str.length() <= 1){
            return str;
        }
        String rightSideArray = reverseString(str.substring(str.length() / 2));
        String leftSideArray = reverseString(str.substring(0,str.length() / 2));
        return rightSideArray + leftSideArray;
    }
}
