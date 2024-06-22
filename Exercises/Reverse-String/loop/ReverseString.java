import java.util.Scanner;
public class ReverseString {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string to reverse: ");
            String toReverseString = sc.nextLine();
            char[] charString = toReverseString.toCharArray();
            for(int i = 0; i < charString.length / 2 ; i++) {
                char temp = charString[i];
                charString[i] = charString[charString.length -1 - i];
                charString[charString.length -1 - i] = temp;
            }
            toReverseString = new String(charString);
            System.out.println("The reverse string is: " + toReverseString);
        }    
}
