public class StringPositionDemo {
    public static void main(String[] args){

        String text = "welcome to our site";
        System.out.println("the original string are : " + text);

        System.out.println("the index of 'm' in the string is : " + text.indexOf("m"));

        System.out.println("is the string start with 'a' character? " + text.startsWith("a"));

        System.out.println("is the string ends with 'e' character? " + text.endsWith("e"));


    }
}
