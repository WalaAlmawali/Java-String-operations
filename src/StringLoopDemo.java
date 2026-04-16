public class StringLoopDemo {
    public static void main(String[] args){

        String sentence = "Java Programming";
        System.out.println("Original String: " +"\n"+sentence );
        System.out.println("Length of String is: " + sentence.length());

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            char lower = Character.toLowerCase(ch);

            System.out.println(ch);

            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                vowels++;
            }

            else if (lower >= 'a' && lower <= 'z') {
                consonants++;
            }

        }


    }
}
