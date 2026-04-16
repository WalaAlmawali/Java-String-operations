public class StringReverseDemo {
    public static void main(String[] args) {

        String text = "Java Programming";
        System.out.println("Original String: " +"\n"+text );

        System.out.println("Length of String is: " + text.length());

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }



    }
}
