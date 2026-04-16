public class StringIfElseIfDemo {
    public static void main(String[] args) {

        String text = "Java Programming";
        System.out.println("Original String: " +"\n"+text );

        if (text.isEmpty()) {
            System.out.println("The string is empty.");

        } else if (text.length() < 5) {

            System.out.println("The string is too short.");

        }  else if (text.startsWith("Java")) {

            System.out.println("The string starts with 'Java'.");

        }  else if (text.endsWith(".")) {

            System.out.println("The string ends with '.'");

        }  else if (text.equalsIgnoreCase("javaprogram")) {
            System.out.println("The string matches 'javaprogram' (ignore case).");
        }

        else {
            System.out.println("The string does not match any condition.");
        }
    }
}
