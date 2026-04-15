public class StringCompareDemo {
    public static void main(String[] args){

        String word = "Sara";
        System.out.println(word);

        System.out.println(word.charAt(2));
        System.out.println(word.substring(1,3));

        String word2 = "mohammed";
        System.out.println("is "+word + " equal to "+ word2 + "?" +word.equals(word2) );

        String word3 = "Sara";
        System.out.println("is "+word + " equal to "+ word3 + "?" +word.equals(word3));
    }
}
