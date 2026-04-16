public class StringWhileDemo {
    public static void main(String[] args){
        String sentence = "I love Programming";
        System.out.println("Original String: " +"\n"+sentence );

        System.out.println("Length of String is: " + sentence.length());
        int i = 0;

        while (i < sentence.length()) {

            char ch = sentence.charAt(i);
            System.out.println(ch);

        }

    }
}
