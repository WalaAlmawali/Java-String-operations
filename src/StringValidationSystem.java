
import java.util.*;

public class StringValidationSystem {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sample string: ");
        String text = input.nextLine();

        System.out.println("\nOriginal String: " + text);

        System.out.println("Length of string: " + text.length());

        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());

        System.out.print("\nEnter a word to search: ");
        String searchWord = input.nextLine();

        if (text.contains(searchWord)) {
            System.out.println("The word '" + searchWord + "' EXISTS in the string.");
        } else {
            System.out.println("The word '" + searchWord + "' does NOT exist in the string.");
        }

        System.out.print("\nEnter another string to compare: ");
        String compareText = input.nextLine();

        if (text.equalsIgnoreCase(compareText)) {
            System.out.println("Both strings are EQUAL (ignore case).");
        } else {
            System.out.println("Strings are NOT equal.");
        }


        if (text.length() >= 5) {
            System.out.println("Substring (0 to 5): " + text.substring(0, 5));
        } else {
            System.out.println("String is too short for substring operation.");
        }

        if (text.length() > 5) {
            System.out.println("The string length is greater than 5 (Valid length).");
        } else {
            System.out.println("The string length is 5 or less (Too short).");
        }


    }
}
