public class StringIfElseDemo {
    public static void main(String[] args) {
        String username = "Wala Al-mawali";
        System.out.println("User name: " +"\n"+username );

        if (username.length() > 5) {
            System.out.println("Username length is valid.");
        } else {
            System.out.println("Username is too short.");
        }

        String password = "123456";

        if (password.equals("123456")) {
            System.out.println("Password is correct.");
        } else {
            System.out.println("Password is incorrect.");
        }

    }
}
