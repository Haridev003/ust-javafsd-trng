import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);
        String str = inp.nextLine
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println( reverse);
    }
}
