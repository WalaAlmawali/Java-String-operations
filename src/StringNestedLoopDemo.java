public class StringNestedLoopDemo {
    public static void main(String[] args){
        String text1 = "Hello";
        String text2 = "World!";

        System.out.println("First String: " + text1);
        System.out.println("Second String: " + text2);

        System.out.println("Length of first String is: " + text1.length());
        System.out.println("Length of second String is: " + text2.length());

        int matchCount = 0;


        for (int i = 0; i < text1.length(); i++) {

            for (int j = 0; j < text2.length(); j++) {

                char ch1 = text1.charAt(i);
                char ch2 = text2.charAt(j);

                if (ch1 == ch2) {

                    System.out.println("Matching character: " + ch1);
                    matchCount++;

                }

            }

        }


    }
}
