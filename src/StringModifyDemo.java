public class StringModifyDemo {
    public static void main(String[] args){


        String sentence = "  Hello   world  !";

        System.out.println(sentence);

        System.out.println(sentence.trim());

        System.out.println(" is the sentence contain world 'world' ? "+sentence.contains("world"));

        String updatedSentence = sentence.replace("Hello", "Welcome");

        System.out.println("sentenc after update : " + updatedSentence);

    }
}
