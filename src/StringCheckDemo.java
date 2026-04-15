public class StringCheckDemo {
    public static void main(String[] args){

        String message = "welcome to our class";
        System.out.println(" the original message is : " +"\n" +message );

        System.out.println("first to world in the string : " +message.substring(0,10) );

        String updatedMessage = message.replace("our","my");
        System.out.println("the updated message are : " + updatedMessage);


    }
}
