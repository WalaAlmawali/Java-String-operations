import java.util.*;
public class StringMenuDemo {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sample string: ");
        String text = input.nextLine();

        System.out.println("\n===== STRING MENU =====");
        System.out.println("1. Display Length of String");
        System.out.println("2. Convert to UPPERCASE");
        System.out.println("3. Convert to lowercase");
        System.out.println("4. Check if string contains a word");
        System.out.println("5. Compare with another string (ignore case)");
        System.out.println("========================");


    }
}
