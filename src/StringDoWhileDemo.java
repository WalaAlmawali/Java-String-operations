public class StringDoWhileDemo {
    public static void main(String[] args){
        String sentence = "Sara is a smart girl!";
        System.out.println("Original String: " +"\n"+sentence );

        System.out.println("Length of String is: " + sentence.length());


        int i = 0;
        int lowercaseLetters = 0;
        int spaces = 0;


        do {
            char ch = sentence.charAt(i);
            System.out.println(ch);

            if (ch >= 'a' && ch <= 'z') {
                lowercaseLetters++;
            }

            if (ch == ' ') {
                spaces++;
            }




            i++;

        } while (i < sentence.length());

        System.out.println("Total Lowercase Letters: " + lowercaseLetters);

        System.out.println("Total Spaces: " + spaces);
    }
}
