public class StringRecordDemo {
    public static void main(String[]args){


        String record = " Welcome to our country!  ";
        System.out.println("Original String: " +"\n"+record );

        String trimRecord = record.trim();
        System.out.println("Cleaned String (remove space) : " + "\n"+trimRecord);

        String word1 = "Java";
        String word2 = "java";

        System.out.println("Are " + word1 + " equals to " + word2 +"?" +word1.equalsIgnoreCase(word2));


    }
}
