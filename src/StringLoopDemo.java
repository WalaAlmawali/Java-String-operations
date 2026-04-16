public class StringLoopDemo {
    public static void main(String[] args){

        String sentence = "Java Programming";
        System.out.println("Original String: " +"\n"+sentence );
        System.out.println("Length of String is: " + sentence.length());


        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            System.out.println(ch);

        }


    }
}
