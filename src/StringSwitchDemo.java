public class StringSwitchDemo {
    public static void main(String[] args) {

        String role = "Admin";
        System.out.println("User Role: " + role);

        switch (role) {

            case "Admin":

                System.out.println("Access granted: Full system control.");
                break;

            case "User":
                System.out.println("Access granted: Limited user access.");
                break;

            case "Guest":
                System.out.println("Access granted: View only.");
                break;

            default:
                System.out.println("Unknown role. Access denied.");






        }


    }
}
