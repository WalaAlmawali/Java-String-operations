public class StringProcessDemo {
    public static void main(String[] args){
        String record = "  Wala, IT, wala.salam.9888@gmail.com ";
        System.out.println(" the original record is : " +"\n" +record );

        String trimedString = record.trim();
        System.out.println(trimedString);

        String[] parts = trimedString.split(",");
        for (String part : parts) {
            System.out.println(part);
        }

        String word1 = "Sara";
        String word2 = "sara";

        System.out.println("is " + word1 +" equals to "+word2+ "?" + word1.equalsIgnoreCase(word2));

        String world3 = "";
        System.out.println("Is the string"  +"'"+ world3 +"'"+"empty? " + world3.isEmpty());


    }
}
