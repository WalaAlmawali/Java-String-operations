public class StringValidationDemo {
    public static void main(String[] args){


        String text = "It's my birthday!";
        System.out.println("Original String: " +"\n"+text );

        System.out.println("Is the string start with 'It's'? " + text.startsWith("It's"));
        System.out.println("Is the string ends with '.'? " + text.endsWith("."));

        String updatedText = text.replace("my", "your");
        System.out.println("updated  String: " +"\n"+updatedText );

        System.out.println("the last world in the string is :" + updatedText.substring(10,updatedText.length()));








    }
}
