public class StringIfElseDemo {
    public static void main(String[] args) {
        String username = "Wala Al-mawali";
        System.out.println("User name: " +"\n"+username );

        if (username.length() > 5) {
            System.out.println("Username length is valid.");
        } else {
            System.out.println("Username is too short.");
        }

    }
}
