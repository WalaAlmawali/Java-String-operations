public class StringDataDemo {
    public static void main(String[] args){

        String sentence = "Oman is a big country";
        System.out.println(" the original sentence is : " +"\n" +sentence );

        String inUpper = sentence.toUpperCase();
        System.out.println("sentence in Upper case : " + inUpper);

        String inLower = sentence.toLowerCase();
        System.out.println("sentence in Lowre case : " + inLower);

        System.out.println("the index of big in sentence is: "+ sentence.indexOf("big"));

        System.out.println(" the first two world in the sentence are : "+sentence.substring(0,7)) ;
    }
}
