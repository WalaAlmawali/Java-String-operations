public class StringReverseDemo {
    public static void main(String[] args) {

        String text = "Java Programming";
        System.out.println("Original String: " +"\n"+text );

        System.out.println("Length of String is: " + text.length());

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }

        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        System.out.println("Reversed String : " +"\n"+ reversed);



    }
}
